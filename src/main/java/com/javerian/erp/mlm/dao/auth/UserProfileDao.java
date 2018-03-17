package com.javerian.erp.mlm.dao.auth;

import java.util.List;

import com.javerian.erp.mlm.model.auth.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
