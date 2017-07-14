package com.calc.gui.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
	
	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private static DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HHmmss");
	
	public static String getDateTime() {
		
		LocalDateTime now = LocalDateTime.now();
        System.out.println("Date & Time: "+dateTimeFormat.format(now));
        
        return dateTimeFormat.format(now);
		
	}
	
	// method to return TimeStamp
	public static String getTimeStamp() {
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	// getDateTimeEx() 
	public static void getDateTimeEx() {
		
		Date date = new Date();
        System.out.println(dateFormat.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dateTimeFormat.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
		
	}

}
