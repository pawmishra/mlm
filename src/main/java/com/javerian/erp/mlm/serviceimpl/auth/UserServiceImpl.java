package com.javerian.erp.mlm.serviceimpl.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.UserDao;
import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.vo.ChangePasswordVO;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public User findById(Long id) {
		return dao.findById(id);
	}

	public User findBySSO(String sso) {
		User user = dao.findBySSO(sso);
		return user;
	}

	public void saveUser(User user) {

		User sponserObj = findById(user.getSponser_id());

		int i = 1;
		User obj = findBySSO(user.getUsername());
		while (obj != null) {
			user.setUsername(user.getUsername() + i);
			obj = findBySSO(user.getUsername());
		}

		List<User> childOfSponser = getChildOfSponserById(sponserObj.getId());

		if (childOfSponser != null && childOfSponser.size() < 2) {

			for (User childObj : childOfSponser) {
				if (user.getPosition_left_or_right().equalsIgnoreCase("Left")
						&& user.getPosition_left_or_right().equalsIgnoreCase(childObj.getPosition_left_or_right())) {
					user.setPosition_left_or_right("Right");
				} else if (user.getPosition_left_or_right().equalsIgnoreCase("Right")
						&& user.getPosition_left_or_right().equalsIgnoreCase(childObj.getPosition_left_or_right())) {
					user.setPosition_left_or_right("Left");
				}
			}
			user.setLevel_from_root(sponserObj.getLevel_from_root() + 1);
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			dao.save(user);
		}
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate
	 * update explicitly. Just fetch the entity from db and update it with proper
	 * values within transaction. It will be updated in db once transaction ends.
	 */
	public void updateUser(User user) {

		User entity = dao.findBySSO(user.getUsername());
		// User entity = dao.findById(user.getId());

		if (entity != null) {

			if (user.getId() == null) {
				user.setId(entity.getId());
			}
			// entity.setUsername(user.getUsername());
			// if (!user.getPassword().equals(entity.getPassword())) {
			// entity.setPassword(passwordEncoder.encode(user.getPassword()));
			// }
			// entity.setFirstName(user.getFirstName());
			// entity.setLastName(user.getLastName());
			// entity.setEmail(user.getEmail());
			// entity.setUserProfiles(user.getUserProfiles());

			dao.updateUser(user);
		}
	}

	public void deleteUserBySSO(String sso) {
		dao.deleteBySSO(sso);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public boolean isUserSSOUnique(Long id, String sso) {
		User user = findBySSO(sso);
		return (user == null || ((id != null) && (user.getId() == id)));
	}

	@Override
	public void changePassword(ChangePasswordVO changePass) {

		User userObjFromDb = dao.findBySSO(changePass.getUserName());

		if (userObjFromDb != null && !changePass.getNewPassword().equals(userObjFromDb.getPassword())) {
			userObjFromDb.setPassword(passwordEncoder.encode(changePass.getNewPassword()));
		}
		dao.updateUser(userObjFromDb);
	}

	@Override
	public List<User> getChildOfSponserById(Long id) {
		return dao.getChildOfSponserById(id);
	}
}
