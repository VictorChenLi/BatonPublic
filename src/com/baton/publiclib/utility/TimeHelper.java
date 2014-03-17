package com.baton.publiclib.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeHelper {

	// For universal usage of time format
	public static String DATE_FORMAT_LONG = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	
	public static String getStrTimeFromMillis(long date)
	{
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date);
		SimpleDateFormat myFormat = new SimpleDateFormat(DATE_FORMAT_LONG); 
		return myFormat.format(c.getTime());
	}
	
	public static long getDataTime(String strTime)
	{
		Date parseDate=null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_LONG);
		try {
			parseDate = simpleDateFormat.parse(strTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parseDate.getTime();
	}
}
