package com.javerian.erp.mlm.model.workflow;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "latestnews")
public class LatestNews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "news_content")
	private String news_content;
	@Column(name = "news_creation_datetime")
	private Timestamp news_creation_datetime;
	@Column(name = "valid_upto_datetime")
	private Timestamp valid_upto_datetime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNews_content() {
		return news_content;
	}

	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}

	public Timestamp getNews_creation_datetime() {
		return news_creation_datetime;
	}

	public void setNews_creation_datetime(Timestamp news_creation_datetime) {
		this.news_creation_datetime = news_creation_datetime;
	}

	public Timestamp getValid_upto_datetime() {
		return valid_upto_datetime;
	}

	public void setValid_upto_datetime(Timestamp valid_upto_datetime) {
		this.valid_upto_datetime = valid_upto_datetime;
	}

}