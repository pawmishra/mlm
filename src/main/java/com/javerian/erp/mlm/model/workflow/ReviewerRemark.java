package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reviewer_remark")
public class ReviewerRemark {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Long project_id;
	@Column
	private Long document_id;
	@Column
	private Long question_id;
	@Column
	private Long review_rating;

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

	public Long getDocument_id() {
		return document_id;
	}

	public void setDocument_id(Long document_id) {
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

}