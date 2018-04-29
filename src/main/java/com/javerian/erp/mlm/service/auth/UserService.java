package com.javerian.erp.mlm.service.auth;

import java.util.List;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.vo.ChangePasswordVO;

public interface UserService {

	User findById(Long id);

	User findBySSO(String sso);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserBySSO(String sso);

	List<User> findAllUsers();

	boolean isUserSSOUnique(Long id, String sso);

	String changePassword(ChangePasswordVO changePass);

	public List<User> getChildOfSponserById(Long id);

	public List<User> getLowestLevelUsers();

	public User getLoggedInUser();

	public List<User> getChildsOfSponserById(Long id, int depth);
}