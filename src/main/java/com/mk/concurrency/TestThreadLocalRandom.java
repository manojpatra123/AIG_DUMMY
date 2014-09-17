/**
 * 
 */
package com.mk.concurrency;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 *
 * @author mpatra
 */

public class TestThreadLocalRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double i = ThreadLocalRandom.current().nextDouble();
		System.out.println("i:" + i);
		

	}

}
