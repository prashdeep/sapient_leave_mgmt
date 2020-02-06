package com.sapient.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws ParseException {
		Date currentDate = new Date();
		
		System.out.println(currentDate.getDate());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getDay());
		System.out.println("Date >> "+currentDate);
		
		//Printing the date in different format
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy EEEEE zzzzz");
		
		String todaysDate = dateFormat.format(currentDate);
		System.out.println("Today's date "+ todaysDate);
		
		//Date date = dateFormat.parse("21-02-29");
		//System.out.println(date.getDay());
	}

}
