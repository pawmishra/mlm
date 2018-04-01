package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long question_id;
	@Column
	private Long project_id;
	@Column
	private String survey_questions;

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public String getSurvey_questions() {
		return survey_questions;
	}

	public void setSurvey_questions(String survey_questions) {
		this.survey_questions = survey_questions;
	}

}