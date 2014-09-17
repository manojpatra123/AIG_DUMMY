/**
 * 
 */
package com.designPattern.structural.bridge;

/**
 * 
 *
 * @author mpatra
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Booking casuality = new CasualityBooking(new BricsCall(), new DownstreamCall());
		casuality.book();
		Booking fl = new FLBooking(new DownstreamCall(),new BricsCall());
		fl.book();

	}

}
