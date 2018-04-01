package com.javerian.erp.mlm.dao.auth;

import java.util.List;

import com.javerian.erp.mlm.model.auth.User;

public interface UserDao {

	User findById(Long id);

	User findBySSO(String username);

	void save(User user);

	void deleteBySSO(String username);

	List<User> findAllUsers();

}
