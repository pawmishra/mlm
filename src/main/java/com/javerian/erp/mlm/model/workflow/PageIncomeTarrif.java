package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "page_income_tarrif")
public class PageIncomeTarrif {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long page_income_id;
	@Column(name = "document_type")
	private String document_type;
	@Column(name = "number_of_pages")
	private Long number_of_pages;
	@Column(name = "amount")
	private Long amount;
	@Column(name = "per_page_tarrif")
	private Long per_page_tarrif;

	public Long getPage_income_id() {
		return page_income_id;
	}

	public void setPage_income_id(Long page_income_id) {
		this.page_income_id = page_income_id;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public Long getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(Long number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getPer_page_tarrif() {
		return per_page_tarrif;
	}

	public void setPer_page_tarrif(Long per_page_tarrif) {
		this.per_page_tarrif = per_page_tarrif;
	}

}
