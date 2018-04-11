package com.javerian.erp.mlm.model.workflow;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.javerian.erp.mlm.model.auth.User;

@Entity
@Table(name = "member_detail")
public class MemberDetails {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	private Long user_id;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "joining_date")
	private Date joining_date;
	@Column(name = "modified_date")
	private Date modified_date;
	@Column
	private String pan_number;
	@Column
	private String path_to_pan_card_image;
	@Column
	private String aadhar_number;
	@Column
	private String path_to_aadhar_front_image;
	@Column
	private String path_to_aadhar_back_image;

	@OneToOne(mappedBy = "memberDetails", cascade = CascadeType.ALL)
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private User user;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public String getPath_to_pan_card_image() {
		return path_to_pan_card_image;
	}

	public void setPath_to_pan_card_image(String path_to_pan_card_image) {
		this.path_to_pan_card_image = path_to_pan_card_image;
	}

	public String getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public String getPath_to_aadhar_front_image() {
		return path_to_aadhar_front_image;
	}

	public void setPath_to_aadhar_front_image(String path_to_aadhar_front_image) {
		this.path_to_aadhar_front_image = path_to_aadhar_front_image;
	}

	public String getPath_to_aadhar_back_image() {
		return path_to_aadhar_back_image;
	}

	public void setPath_to_aadhar_back_image(String path_to_aadhar_back_image) {
		this.path_to_aadhar_back_image = path_to_aadhar_back_image;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}