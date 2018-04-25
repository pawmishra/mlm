package com.javerian.erp.mlm.serviceimpl.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.controller.UserAuthentication;
import com.javerian.erp.mlm.dao.auth.UserDao;
import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.util.Config;
import com.javerian.erp.mlm.vo.ChangePasswordVO;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	UserAuthentication authenticationTrustResolver;

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
		} else {

			List<User> lowestLevelUsers = getLowestLevelUsers();
			for (User userObj : lowestLevelUsers) {

				childOfSponser = getChildOfSponserById(userObj.getId());
				if (childOfSponser != null && childOfSponser.size() < 2) {
					for (User childObj : childOfSponser) {
						if (user.getPosition_left_or_right().equalsIgnoreCase("Left") && user
								.getPosition_left_or_right().equalsIgnoreCase(childObj.getPosition_left_or_right())) {
							user.setPosition_left_or_right("Right");
						} else if (user.getPosition_left_or_right().equalsIgnoreCase("Right") && user
								.getPosition_left_or_right().equalsIgnoreCase(childObj.getPosition_left_or_right())) {
							user.setPosition_left_or_right("Left");
						}
					}
					user.setLevel_from_root(userObj.getLevel_from_root() + 1);
					user.setPassword(passwordEncoder.encode(user.getPassword()));
					user.setSponser_id(userObj.getId());
					dao.save(user);

					break;
				}
			}
		}
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate
	 * update explicitly. Just fetch the entity from db and update it with proper
	 * values within transaction. It will be updated in db once transaction ends.
	 */
	public void updateUser(User user) {

		User userObjFromDb = dao.findById(user.getId());

		if (userObjFromDb != null) {

			if (user.getFirstName() != null && !userObjFromDb.getFirstName().equalsIgnoreCase(user.getFirstName())) {
				userObjFromDb.setFirstName(user.getFirstName());
			}
			if (user.getLastName() != null && !userObjFromDb.getLastName().equalsIgnoreCase(user.getLastName())) {
				userObjFromDb.setLastName(user.getLastName());
			}
			if (user.getEmail() != null && !userObjFromDb.getEmail().equalsIgnoreCase(user.getEmail())) {
				userObjFromDb.setEmail(user.getEmail());
			}
			if (user.getMemberDetails().getDob() != null) {
				userObjFromDb.getMemberDetails().setDob(user.getMemberDetails().getDob());
			}
			if (user.getMemberDetails().getGender() != null) {
				userObjFromDb.getMemberDetails().setGender(user.getMemberDetails().getGender());
			}
			if (user.getMemberDetails().getAadhar_number() != null) {
				userObjFromDb.getMemberDetails().setAadhar_number(user.getMemberDetails().getAadhar_number());
			}
			if (user.getMemberDetails().getPan_number() != null) {
				userObjFromDb.getMemberDetails().setPan_number(user.getMemberDetails().getPan_number());
			}
			if (user.getMemberDetails().getPath_to_aadhar_front_image() != null) {
				userObjFromDb.getMemberDetails()
						.setPath_to_aadhar_front_image(user.getMemberDetails().getPath_to_aadhar_front_image());
			}
			if (user.getMemberDetails().getPath_to_aadhar_back_image() != null) {
				userObjFromDb.getMemberDetails()
						.setPath_to_aadhar_back_image(user.getMemberDetails().getPath_to_aadhar_back_image());
			}
			if (user.getMemberDetails().getPath_to_pan_card_image() != null) {
				userObjFromDb.getMemberDetails()
						.setPath_to_pan_card_image(user.getMemberDetails().getPath_to_pan_card_image());
			}
			if (user.getMemberDetails().getAddress().getHouseNo() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setHouseNo(user.getMemberDetails().getAddress().getHouseNo());
			}
			if (user.getMemberDetails().getAddress().getStreetName() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setStreetName(user.getMemberDetails().getAddress().getStreetName());
			}
			if (user.getMemberDetails().getAddress().getLocality() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setLocality(user.getMemberDetails().getAddress().getLocality());
			}
			if (user.getMemberDetails().getAddress().getCity() != null) {
				userObjFromDb.getMemberDetails().getAddress().setCity(user.getMemberDetails().getAddress().getCity());
			}
			if (user.getMemberDetails().getAddress().getState() != null) {
				userObjFromDb.getMemberDetails().getAddress().setState(user.getMemberDetails().getAddress().getState());
			}
			if (user.getMemberDetails().getAddress().getCountry() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setCountry(user.getMemberDetails().getAddress().getCountry());
			}
			if (user.getMemberDetails().getAddress().getPincode() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setPincode(user.getMemberDetails().getAddress().getPincode());
			}
			if (user.getMemberDetails().getAddress().getMobile() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setMobile(user.getMemberDetails().getAddress().getMobile());
			}
			if (user.getMemberDetails().getAddress().getAltContactNo() != null) {
				userObjFromDb.getMemberDetails().getAddress()
						.setAltContactNo(user.getMemberDetails().getAddress().getAltContactNo());
			}
			if (user.getMemberDetails().getAddress().getEmail() != null) {
				userObjFromDb.getMemberDetails().getAddress().setEmail(user.getMemberDetails().getAddress().getEmail());
			}
			dao.updateUser(userObjFromDb);
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
	public String changePassword(ChangePasswordVO changePass) {

		User userObjFromDb = dao.findBySSO(changePass.getUserName());

		if (userObjFromDb != null
				&& passwordEncoder.matches(changePass.getExistingPass(), userObjFromDb.getPassword())) {

			userObjFromDb.setPassword(passwordEncoder.encode(changePass.getNewPassword()));
			dao.updateUser(userObjFromDb);
			return Config.MSG_SUCCESS;
		}

		return Config.MSG_PASS_UPDATE_FAILED;
	}

	@Override
	public List<User> getChildOfSponserById(Long id) {
		return dao.getChildOfSponserById(id);
	}

	@Override
	public List<User> getLowestLevelUsers() {
		return dao.getLowestLevelUsers();
	}

	public User getLoggedInUser() {
		String userName = authenticationTrustResolver.getPrincipal();
		return findBySSO(userName);
	}
}
