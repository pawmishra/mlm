package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rating_id;
	@Column
	private String rating_type;
	@Column
	private Long rating;

	public Long getRating_id() {
		return rating_id;
	}

	public void setRating_id(Long rating_id) {
		this.rating_id = rating_id;
	}

	public String getRating_type() {
		return rating_type;
	}

	public void setRating_type(String rating_type) {
		this.rating_type = rating_type;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

}