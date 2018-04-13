package com.javerian.erp.mlm.util;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.util.StringUtils;

public class Util {

	public static Timestamp getCurrentTime() {

		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		return ts;
	}

	public static String generateTicketId(String requestString) {

		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);

		String dateTime = StringUtils.delete(ts.toString(), " ");
		dateTime = StringUtils.delete(dateTime, ":");
		dateTime = StringUtils.delete(dateTime, ".");
		dateTime = StringUtils.delete(dateTime, "-");
		return requestString + dateTime;
	}

	public static String getFileNameWithoutExt(String fileName) {
		String fileNameWithoutExt = "";
		fileNameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
		return fileNameWithoutExt;
	}

}
