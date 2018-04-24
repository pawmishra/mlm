package com.javerian.erp.mlm.util;

public enum LedgerOptions {

	CREDIT("CREDIT"), DEBIT("DEBIT"), REGISTRAATION_AMOUNT("REGISTRATION_AMOUNT");

	private final String value;

	LedgerOptions(String value) {
		this.value = value;
	}

	public String getLedgerOptions() { // Getter
		return value;
	}

}
