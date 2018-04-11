package com.javerian.erp.mlm.vo;

public class ChangePasswordVO {

	private String userName;
	private String existingPass;
	private String newPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getExistingPass() {
		return existingPass;
	}

	public void setExistingPass(String existingPass) {
		this.existingPass = existingPass;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
