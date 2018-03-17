package com.javerian.erp.mlm.service.auth;

import java.util.List;

import com.javerian.erp.mlm.model.auth.User;

public interface UserService {

	User findById(int id);

	User findBySSO(String sso);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserBySSO(String sso);

	List<User> findAllUsers();

	boolean isUserSSOUnique(Integer id, String sso);

}