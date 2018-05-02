package com.javerian.erp.mlm.util;

public enum StatusEnum {

	OPEN(1), //
	CLOSED(2), //
	INPROGRESS(3);

	private final int value;

	StatusEnum(int value) {
		this.value = value;
	}

	public int getStatus() { // Getter
		return value;
	}

}
