package com.javerian.erp.mlm.util;

public enum LedgerOptions {

	REGISTRATION_AMOUNT("REGISTRATION_AMOUNT"), //
	REPURCHASE_AMOUNT("REPURCHASE_AMOUNT"), //
	LEVEL_INCOME("LEVEL_INCOME"), //
	ALL_LEVEL_INCOME("LEVEL%"), //
	PAGE_REVIEW_INCOME("PAGE_REVIEW_INCOME");

	private final String value;

	LedgerOptions(String value) {
		this.value = value;
	}

	public String getLedgerOptions() { // Getter
		return value;
	}

}
