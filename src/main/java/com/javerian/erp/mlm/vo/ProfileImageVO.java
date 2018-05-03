package com.javerian.erp.mlm.vo;

import org.springframework.web.multipart.MultipartFile;

public class ProfileImageVO {

	private Long user_id;
	private MultipartFile profileImage;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public MultipartFile getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(MultipartFile profileImage) {
		this.profileImage = profileImage;
	}

}
