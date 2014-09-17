/**
 * 
 */
package com.mk.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 *
 * @author mpatra
 */

public class BlockingQuoteTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		new Thread(producer).start();
		System.out.println("After filling:" + queue);
//		Thread.sleep(2000);
		new Thread(consumer).start();
		Thread.sleep(10000);
		System.out.println("After consume:" + queue);
		
	}
	

	


}

