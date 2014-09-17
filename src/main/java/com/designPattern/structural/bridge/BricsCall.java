/**
 * 
 */
package com.designPattern.structural.bridge;

/**
 * 
 *
 * @author mpatra
 */

public class BricsCall implements NgbsBooking {

	/* (non-Javadoc)
	 * @see com.designPattern.structural.bridge.NgbsBooking#call()
	 */
	@Override
	public void call() {
		System.out.println("This is brics call to fetch booking data");

	}

}
