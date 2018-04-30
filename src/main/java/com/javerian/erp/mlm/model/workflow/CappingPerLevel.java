package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cappingperlevel")
public class CappingPerLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "level")
	private int level;
	@Column(name = "member_per_level")
	private int member_per_level;
	@Column(name = "total_number_of_child_per_level")
	private int total_number_of_child_per_level;
	@Column(name = "payment_capping_per_level")
	private int payment_capping_per_level;
	@Column(name = "formula")
	private String formula;
	@Column(name = "formulresult")
	private int formulresult;
	@Column(name = "carry_forward_node")
	private int carry_forward_node;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMember_per_level() {
		return member_per_level;
	}

	public void setMember_per_level(int member_per_level) {
		this.member_per_level = member_per_level;
	}

	public int getTotal_number_of_child_per_level() {
		return total_number_of_child_per_level;
	}

	public void setTotal_number_of_child_per_level(int total_number_of_child_per_level) {
		this.total_number_of_child_per_level = total_number_of_child_per_level;
	}

	public int getPayment_capping_per_level() {
		return payment_capping_per_level;
	}

	public void setPayment_capping_per_level(int payment_capping_per_level) {
		this.payment_capping_per_level = payment_capping_per_level;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public int getFormulresult() {
		return formulresult;
	}

	public void setFormulresult(int formulresult) {
		this.formulresult = formulresult;
	}

	public int getCarry_forward_node() {
		return carry_forward_node;
	}

	public void setCarry_forward_node(int carry_forward_node) {
		this.carry_forward_node = carry_forward_node;
	}

}
