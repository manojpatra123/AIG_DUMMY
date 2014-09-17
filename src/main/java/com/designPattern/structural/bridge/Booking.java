/**
 * 
 */
package com.designPattern.structural.bridge;

/**
 * 
 *
 * @author mpatra
 */

public abstract class Booking {
	
	NgbsBooking ngbsStep1 = null;
	NgbsBooking ngbsStep2 = null;
	
	Booking(NgbsBooking b1, NgbsBooking b2){
		ngbsStep1 = b1;
		ngbsStep2 = b2;
	}
	
	abstract void book();
}
