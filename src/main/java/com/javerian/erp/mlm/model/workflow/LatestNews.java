package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class LatestNews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long news_id;
	@Column(name = "news")
	private Long news;

	public final Long getNews_id() {
		return news_id;
	}

	public final void setNews_id(Long news_id) {
		this.news_id = news_id;
	}

	public final Long getNews() {
		return news;
	}

	public final void setNews(Long news) {
		this.news = news;
	}

}