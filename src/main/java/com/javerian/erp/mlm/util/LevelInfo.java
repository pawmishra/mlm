package com.javerian.erp.mlm.util;

public enum LevelInfo {

	LEVEL1_INCOME(1, "LEVEL1_INCOME"), //
	LEVEL2_INCOME(2, "LEVEL2_INCOME"), //
	LEVEL3_INCOME(3, "LEVEL3_INCOME"), //
	LEVEL4_INCOME(4, "LEVEL4_INCOME"), //
	LEVEL5_INCOME(5, "LEVEL5_INCOME"), //
	LEVEL6_INCOME(6, "LEVEL6_INCOME"), //
	LEVEL7_INCOME(7, "LEVEL7_INCOME"), //
	LEVEL8_INCOME(8, "LEVEL8_INCOME"), //
	LEVEL9_INCOME(9, "LEVEL9_INCOME"), //
	LEVEL10_INCOME(10, "LEVEL10_INCOME"), //
	LEVEL11_INCOME(11, "LEVEL11_INCOME"), //
	LEVEL12_INCOME(12, "LEVEL12_INCOME"), //
	LEVEL_INVALID(-1, "LEVEL_INVALID");

	private final String value;
	private final int level;

	LevelInfo(int level, String value) {
		this.level = level;
		this.value = value;
	}

	public String getLevelInfo() { // Getter
		return value;
	}

	public int getLevel() { // Getter
		return level;
	}

}
