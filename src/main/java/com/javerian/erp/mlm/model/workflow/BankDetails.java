package com.javerian.erp.mlm.model.workflow;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "customer_bank_details")
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bank_id;
	@Column(name = "customer_id")
	private Long customer_id;
	@Column(name = "bank_name")
	private String bank_name;
	@Column(name = "account_number")
	private Long account_number;
	@Column(name = "ifsc_code")
	private String ifsc_code;
	@Column(name = "account_holder_name")
	private String account_holder_name;
	@Column(name = "mobile_number")
	private String mobile_number;
	@Column(name = "bank_branch")
	private String bank_branch;
	@Column(name = "bank_address")
	private String bank_address;
	@Column(name = "cancelled_cheque_image")
	private String cancelled_cheque_image;
	@Column(name = "nominee_name")
	private String nominee_name;
	@Column(name = "nominee_relation")
	private String nominee_relation;
	@Column(name = "nominee_address")
	private String nominee_address;
	@Column(name = "nominee_dob")
	private Date nominee_dob;
	@Column(name = "nominee_pan")
	private String nominee_pan;
	@Column(name = "nominee_aadhar")
	private String nominee_aadhar;
	@Column(name = "nominee_pan_image_path")
	private String nominee_pan_image_path;
	@Column(name = "nominee_aadhar_image_path")
	private String nominee_aadhar_image_path;

	@Transient
	MultipartFile filePancard;
	@Transient
	MultipartFile fileAadharCardFront;
	@Transient
	MultipartFile fileCanceledCheque;

	public final Long getBank_id() {
		return bank_id;
	}

	public final void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public final Long getCustomer_id() {
		return customer_id;
	}

	public final void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public final String getBank_name() {
		return bank_name;
	}

	public final void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public final Long getAccount_number() {
		return account_number;
	}

	public final void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	public final String getIfsc_code() {
		return ifsc_code;
	}

	public final void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public final String getAccount_holder_name() {
		return account_holder_name;
	}

	public final void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public final String getMobile_number() {
		return mobile_number;
	}

	public final void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public final String getBank_branch() {
		return bank_branch;
	}

	public final void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}

	public final String getBank_address() {
		return bank_address;
	}

	public final void setBank_address(String bank_address) {
		this.bank_address = bank_address;
	}

	public final String getCancelled_cheque_image() {
		return cancelled_cheque_image;
	}

	public final void setCancelled_cheque_image(String cancelled_cheque_image) {
		this.cancelled_cheque_image = cancelled_cheque_image;
	}

	public final String getNominee_name() {
		return nominee_name;
	}

	public final void setNominee_name(String nominee_name) {
		this.nominee_name = nominee_name;
	}

	public final String getNominee_relation() {
		return nominee_relation;
	}

	public final void setNominee_relation(String nominee_relation) {
		this.nominee_relation = nominee_relation;
	}

	public final String getNominee_address() {
		return nominee_address;
	}

	public final void setNominee_address(String nominee_address) {
		this.nominee_address = nominee_address;
	}

	public final Date getNominee_dob() {
		return nominee_dob;
	}

	public final void setNominee_dob(Date nominee_dob) {
		this.nominee_dob = nominee_dob;
	}

	public final String getNominee_pan() {
		return nominee_pan;
	}

	public final void setNominee_pan(String nominee_pan) {
		this.nominee_pan = nominee_pan;
	}

	public final String getNominee_aadhar() {
		return nominee_aadhar;
	}

	public final void setNominee_aadhar(String nominee_aadhar) {
		this.nominee_aadhar = nominee_aadhar;
	}

	public final String getNominee_pan_image_path() {
		return nominee_pan_image_path;
	}

	public final void setNominee_pan_image_path(String nominee_pan_image_path) {
		this.nominee_pan_image_path = nominee_pan_image_path;
	}

	public final String getNominee_aadhar_image_path() {
		return nominee_aadhar_image_path;
	}

	public final void setNominee_aadhar_image_path(String nominee_aadhar_image_path) {
		this.nominee_aadhar_image_path = nominee_aadhar_image_path;
	}

	public MultipartFile getFilePancard() {
		return filePancard;
	}

	public void setFilePancard(MultipartFile filePancard) {
		this.filePancard = filePancard;
	}

	public MultipartFile getFileAadharCardFront() {
		return fileAadharCardFront;
	}

	public void setFileAadharCardFront(MultipartFile fileAadharCardFront) {
		this.fileAadharCardFront = fileAadharCardFront;
	}

	public MultipartFile getFileCanceledCheque() {
		return fileCanceledCheque;
	}

	public void setFileCanceledCheque(MultipartFile fileCanceledCheque) {
		this.fileCanceledCheque = fileCanceledCheque;
	}

}
