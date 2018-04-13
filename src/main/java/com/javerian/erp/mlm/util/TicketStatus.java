package com.javerian.erp.mlm.util;

public enum TicketStatus {

	OPEN("OPEN"), CLOSED("CLOSED"), INPROGRESS("INPROGRESS");

	private final String value;

	TicketStatus(String value) {
		this.value = value;
	}

	public String getTicketStatus() { // Getter
		return value;
	}

}
