package com.javerian.erp.mlm.util;

import java.sql.Timestamp;
import java.util.Date;

public class Util {

	public static Timestamp getCurrentTime() {

		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		return ts;
	}
}
