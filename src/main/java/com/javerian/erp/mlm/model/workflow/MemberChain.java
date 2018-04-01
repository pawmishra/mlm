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
	private Long nodeId;
	@Column(name = "parent_id")
	private Long parentId;
	@Column(name = "child_id")
	private Long childId;
	@Column(name = "level")
	private Integer level;

	public final Long getNodeId() {
		return nodeId;
	}

	public final void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public final Long getParentId() {
		return parentId;
	}

	public final void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public final Long getChildId() {
		return childId;
	}

	public final void setChildId(Long childId) {
		this.childId = childId;
	}

	public final Integer getLevel() {
		return level;
	}

	public final void setLevel(Integer level) {
		this.level = level;
	}

}
