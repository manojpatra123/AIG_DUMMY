/**
 * 
 */
package com.designPattern.structural.bridge;

/**
 * 
 *
 * @author mpatra
 */

public class CasualityBooking extends Booking {

	/**
	 * @param b1
	 * @param b2
	 */
	private NgbsBooking brics;
	private NgbsBooking downstream;
	
	CasualityBooking(NgbsBooking b1, NgbsBooking b2) {
		super(b1, b2);
		this.brics =b1;
		this.downstream = b2;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.designPattern.structural.bridge.Booking#book()
	 */
	@Override
	void book() {
		System.out.println("This is Casuality booking call");
		brics.call();
		downstream.call();
		

	}

}
