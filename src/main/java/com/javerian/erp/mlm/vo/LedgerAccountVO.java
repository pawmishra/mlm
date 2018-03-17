package com.javerian.erp.mlm.vo;

public class LedgerAccountVO {

	private String account_no;
	private String account_name;
	private String account_desc;
	private String account_type;
	private String proposal;
	private String requirement;
	private Boolean manual_entry;
	private String account_unit_type;
	private String account_unit;

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_desc() {
		return account_desc;
	}

	public void setAccount_desc(String account_desc) {
		this.account_desc = account_desc;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getProposal() {
		return proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public Boolean getManual_entry() {
		return manual_entry;
	}

	public void setManual_entry(Boolean manual_entry) {
		this.manual_entry = manual_entry;
	}

	public String getAccount_unit_type() {
		return account_unit_type;
	}

	public void setAccount_unit_type(String account_unit_type) {
		this.account_unit_type = account_unit_type;
	}

	public String getAccount_unit() {
		return account_unit;
	}

	public void setAccount_unit(String account_unit) {
		this.account_unit = account_unit;
	}

}
