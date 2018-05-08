package com.javerian.erp.mlm.model.workflow;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reviewer_remark")
public class ReviewerRemark implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "project_id")
	private Long project_id;
	@Column(name = "question_id")
	private Long question_id;
	@Column(name = "review_rating")
	private Long review_rating;
	@Column(name = "reviewed_by")
	private Long reviewed_by;
	@Column(name = "review_datetime")
	private Timestamp review_datetime;
	@Column(name = "document_id")
	private String document_id;
	@Column(name = "status")
	private Integer status;
	@Column(name = "assign_datetime")
	private Timestamp assign_datetime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public Long getReview_rating() {
		return review_rating;
	}

	public void setReview_rating(Long review_rating) {
		this.review_rating = review_rating;
	}

	public Long getReviewed_by() {
		return reviewed_by;
	}

	public void setReviewed_by(Long reviewed_by) {
		this.reviewed_by = reviewed_by;
	}

	public Timestamp getReview_datetime() {
		return review_datetime;
	}

	public void setReview_datetime(Timestamp timestamp) {
		this.review_datetime = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getAssign_datetime() {
		return assign_datetime;
	}

	public void setAssign_datetime(Timestamp assign_datetime) {
		this.assign_datetime = assign_datetime;
	}

}