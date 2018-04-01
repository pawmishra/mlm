package com.javerian.erp.mlm.model.workflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "help_desk_ticket")
public class HelpDeskTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ticket_id")
	private String ticketId;
	@Column(name = "ticket_resolution_status")
	private String ticketResolutionStatus;
	@Column(name = "problem_type")
	private String problemType;
	@Column(name = "description")
	private String description;
	@Column(name = "resolver_comment")
	private String resolverComment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketResolutionStatus() {
		return ticketResolutionStatus;
	}

	public void setTicketResolutionStatus(String ticketResolutionStatus) {
		this.ticketResolutionStatus = ticketResolutionStatus;
	}

	public String getProblemType() {
		return problemType;
	}

	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResolverComment() {
		return resolverComment;
	}

	public void setResolverComment(String resolverComment) {
		this.resolverComment = resolverComment;
	}

}
