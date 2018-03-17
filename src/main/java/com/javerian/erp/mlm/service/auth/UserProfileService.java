package com.javerian.erp.mlm.service.auth;

import java.util.List;

import com.javerian.erp.mlm.model.auth.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
