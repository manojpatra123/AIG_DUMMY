/**
 * 
 */
package com.designPattern.structural.bridge;

/**
 * 
 *
 * @author mpatra
 */

public class DownstreamCall implements NgbsBooking {

	/* (non-Javadoc)
	 * @see com.designPattern.structural.bridge.NgbsBooking#call()
	 */
	@Override
	public void call() {
		System.out.println("This is call to update data in downstream system");

	}

}
