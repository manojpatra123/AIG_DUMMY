package com.mk.core;

import java.util.Date;

import com.mk.calandar.GeogericanCal;

public class DateCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date startDt = new Date(2013,11,14);
		Date endDt = new Date(2014,11,14);
		System.out.println("START DATE:" + startDt);
		startDt.setYear(startDt.getYear()+1);
		System.out.println("START DATE:" + startDt);

	}

}
