/**
 * 
 */
package com.mk.concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * 
 *
 * @author mpatra
 */

public class Consumer implements Runnable{

	BlockingQueue<String> quoue;
	
	public Consumer(BlockingQueue<String> quoue) {
		this.quoue = quoue;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println(quoue.poll());
//			Thread.sleep(2000);
			System.out.println(quoue.peek());
//			Thread.sleep(2000);
			System.out.println(quoue.poll());
//			Thread.sleep(2000);

		} catch (InterruptedException e) {				
			e.printStackTrace();
		}
		
		
	}
	
}
