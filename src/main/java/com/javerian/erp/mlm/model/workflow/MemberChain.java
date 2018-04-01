package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member_chain")
public class MemberChain {

	@Id
	@Column(name = "node_id")
	private Long node_id;
	@Column(name = "user_id")
	private Long user_id;
	@Column(name = "sponsor_id")
	private Long sponsor_id;
	@Column(name = "level")
	private Integer level;

	public Long getNode_id() {
		return node_id;
	}

	public void setNode_id(Long node_id) {
		this.node_id = node_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getSponsor_id() {
		return sponsor_id;
	}

	public void setSponsor_id(Long sponsor_id) {
		this.sponsor_id = sponsor_id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
