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
	private String ticket_id;
	@Column(name = "ticket_resolution_status")
	private String ticket_resolution_status;
	@Column(name = "problem_type")
	private Long problem_type;
	@Column(name = "description")
	private String description;
	@Column(name = "resolver_comment")
	private String resolver_comment;

	@Column(name = "resolved_by")
	private String resolved_by;
	@Column(name = "resolved_datetime")
	private Timestamp resolved_datetime;
	@Column(name = "ticket_creation_datetime")
	private Timestamp ticket_creation_datetime;

	@Column(name = "ticket_created_by")
	private String ticket_created_by;

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getTicket_id() {
		return ticket_id;
	}

	public final void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}

	public final String getTicket_resolution_status() {
		return ticket_resolution_status;
	}

	public final void setTicket_resolution_status(String ticket_resolution_status) {
		this.ticket_resolution_status = ticket_resolution_status;
	}

	public final Long getProblem_type() {
		return problem_type;
	}

	public final void setProblem_type(Long problem_type) {
		this.problem_type = problem_type;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final String getResolver_comment() {
		return resolver_comment;
	}

	public final void setResolver_comment(String resolver_comment) {
		this.resolver_comment = resolver_comment;
	}

	public final String getResolved_by() {
		return resolved_by;
	}

	public final void setResolved_by(String resolved_by) {
		this.resolved_by = resolved_by;
	}

	public final Timestamp getResolved_datetime() {
		return resolved_datetime;
	}

	public final void setResolved_datetime(Timestamp resolved_datetime) {
		this.resolved_datetime = resolved_datetime;
	}

	public final Timestamp getTicket_creation_datetime() {
		return ticket_creation_datetime;
	}

	public final void setTicket_creation_datetime(Timestamp ticket_creation_datetime) {
		this.ticket_creation_datetime = ticket_creation_datetime;
	}

	public final String getTicket_created_by() {
		return ticket_created_by;
	}

	public final void setTicket_created_by(String ticket_created_by) {
		this.ticket_created_by = ticket_created_by;
	}

}
