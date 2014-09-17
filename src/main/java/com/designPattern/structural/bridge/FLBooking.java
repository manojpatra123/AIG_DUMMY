/**
 * 
 */
package com.designPattern.structural.bridge;

/**
 * 
 *
 * @author mpatra
 */

public class FLBooking extends Booking {

	private NgbsBooking brics;
	private NgbsBooking downstream;

	/**
	 * @param b1
	 * @param b2
	 */
	public FLBooking(NgbsBooking b1, NgbsBooking b2) {
		super(b1, b2);
		this.brics =b1;
		this.downstream = b2;

	}

	/* (non-Javadoc)
	 * @see com.designPattern.structural.bridge.Booking#book()
	 */
	@Override
	void book() {
		System.out.println("This is FL booking call");
		brics.call();
		downstream.call();

	}

}
