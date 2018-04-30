package com.javerian.erp.mlm.model.workflow;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "project_work_detail")
public class ProjectWorkDetails implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prj_work_details_id;
	@Column
	private String ticket_id;
	@Column
	private Long organisation_id;
	@Column
	private String paper_title;
	@Column
	private Long number_of_pages;
	@Column
	private Long subject_category_id;
	@Column
	private Long sub_subject_category_id;
	@Column
	private String document_upload_path;
	@Column
	private String document_id;
	@Column
	private Timestamp upload_datetime_stamp;
	@Column
	private Long user_id;

	@Transient
	List<MultipartFile> file;

	public List<MultipartFile> getFile() {
		return file;
	}

	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}

	public Long getPrj_work_details_id() {
		return prj_work_details_id;
	}

	public void setPrj_work_details_id(Long prj_work_details_id) {
		this.prj_work_details_id = prj_work_details_id;
	}

	public String getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Long getOrganisation_id() {
		return organisation_id;
	}

	public void setOrganisation_id(Long organisation_id) {
		this.organisation_id = organisation_id;
	}

	public String getPaper_title() {
		return paper_title;
	}

	public void setPaper_title(String paper_title) {
		this.paper_title = paper_title;
	}

	public Long getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(Long number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public Long getSubject_category_id() {
		return subject_category_id;
	}

	public void setSubject_category_id(Long subject_category_id) {
		this.subject_category_id = subject_category_id;
	}

	public Long getSub_subject_category_id() {
		return sub_subject_category_id;
	}

	public void setSub_subject_category_id(Long sub_subject_category_id) {
		this.sub_subject_category_id = sub_subject_category_id;
	}

	public String getDocument_upload_path() {
		return document_upload_path;
	}

	public void setDocument_upload_path(String document_upload_path) {
		this.document_upload_path = document_upload_path;
	}

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public Timestamp getUpload_datetime_stamp() {
		return upload_datetime_stamp;
	}

	public void setUpload_datetime_stamp(Timestamp upload_datetime_stamp) {
		this.upload_datetime_stamp = upload_datetime_stamp;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
}
