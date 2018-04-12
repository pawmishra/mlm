package com.javerian.erp.mlm.model.workflow;

import java.sql.Timestamp;

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

	@Column(name = "resolved_by")
	private String resolved_by;
	@Column(name = "resolved_datetime")
	private Timestamp resolved_datetime;
	@Column(name = "ticket_creation_datetime")
	private Timestamp ticket_creation_datetime;

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

	public String getResolved_by() {
		return resolved_by;
	}

	public void setResolved_by(String resolved_by) {
		this.resolved_by = resolved_by;
	}

	public Timestamp getResolved_datetime() {
		return resolved_datetime;
	}

	public void setResolved_datetime(Timestamp resolved_datetime) {
		this.resolved_datetime = resolved_datetime;
	}

	public Timestamp getTicket_creation_datetime() {
		return ticket_creation_datetime;
	}

	public void setTicket_creation_datetime(Timestamp ticket_creation_datetime) {
		this.ticket_creation_datetime = ticket_creation_datetime;
	}

}
