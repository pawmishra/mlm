package com.javerian.erp.mlm.model.workflow;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member_detail")
public class MemberDetails {

	@Id
	@Column(name = "member_id")
	private Long memberId;
	@Column(name = "address")
	private String address;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	public final Long getMemberId() {
		return memberId;
	}

	public final void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	public final Date getDob() {
		return dob;
	}

	public final void setDob(Date dob) {
		this.dob = dob;
	}

	public final String getGender() {
		return gender;
	}

	public final void setGender(String gender) {
		this.gender = gender;
	}

	public final Date getJoiningDate() {
		return joiningDate;
	}

	public final void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public final Date getModifiedDate() {
		return modifiedDate;
	}

	public final void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}