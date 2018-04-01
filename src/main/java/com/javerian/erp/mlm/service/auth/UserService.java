package com.javerian.erp.mlm.service.auth;

import java.util.List;

import com.javerian.erp.mlm.model.auth.User;

public interface UserService {

	User findById(Long id);

	User findBySSO(String sso);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserBySSO(String sso);

	List<User> findAllUsers();

	boolean isUserSSOUnique(Long id, String sso);

}