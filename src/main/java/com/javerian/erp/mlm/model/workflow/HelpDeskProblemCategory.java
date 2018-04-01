package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "help_desk_problem_category")
public class HelpDeskProblemCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hd_category_id;
	@Column(name = "problem_category")
	private String problem_category;

	public Long getHd_category_id() {
		return hd_category_id;
	}

	public void setHd_category_id(Long hd_category_id) {
		this.hd_category_id = hd_category_id;
	}

	public String getProblem_category() {
		return problem_category;
	}

	public void setProblem_category(String problem_category) {
		this.problem_category = problem_category;
	}

}