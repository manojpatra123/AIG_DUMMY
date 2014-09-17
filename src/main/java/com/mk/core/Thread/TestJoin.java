/**
 * 
 */
package com.mk.core.Thread;

import com.mk.core.Thread.TestThread.CallingThread;
import com.mk.core.Thread.TestThread.WaitingThread;

/**
 * 
 *
 * @author mpatra
 */

public class TestJoin {
	
	public static void main(String[] args){
		//		TestThread t = new TestThread();
				WaitingThread w1 = new WaitingThread();
				CallingThread c1 = new CallingThread();
				
				w1.start();
				c1.start();
				try {
					w1.join();
					c1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println("Main ended");
		
	}

}
