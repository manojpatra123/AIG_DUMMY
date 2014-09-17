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

public class Producer implements Runnable{

	BlockingQueue<String> quoue;
	
	public Producer(BlockingQueue<String> quoue) {
		this.quoue = quoue;
	}

	@Override
	public void run() {
		try {
			quoue.put("1");
//			Thread.sleep(2000);
			quoue.put("2");
//			Thread.sleep(2000);
			quoue.put("3");
//			Thread.sleep(2000);

		} catch (InterruptedException e) {				
			e.printStackTrace();
		}
		
		
	}
	
}
