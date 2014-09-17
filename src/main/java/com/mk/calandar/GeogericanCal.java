package com.mk.calandar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GeogericanCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(2013,11,14);
		System.out.println("BEFORE Add" + cal.getTime());
		cal.add(Calendar.YEAR, 1);
		System.out.println("BEFORE Add" + cal.getTime());
		
		Calendar calEnd = new GregorianCalendar(2014,11,15);
		
		if (cal.getTimeInMillis() >= calEnd.getTimeInMillis()){
				System.out.println("Less than or equal to 1 yr");
		}
			else{
				System.out.println("More than 1 yr");
			}				
		
	}

}
