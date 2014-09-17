/**
 * 
 */
package com.mk.core.Thread;

/**
 * 
 *
 * @author mpatra
 */

public class TestThread {
	
	private static final Object obj = new Object();
	
	public static class WaitingThread extends Thread {
		public void run(){
			synchronized (obj) {
				System.out.println("Calling Wait() on Obj");
				try {
					obj.wait();
					System.out.println("After wait call");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		
	}
	
	public static class CallingThread extends Thread {
		
		/* (non-Javadoc)
		 * @see java.lang.Thread#run()
		 */
		@Override
		public void run() {
			synchronized (obj) {
				System.out.println("Sleeping for few seconds");
				try {
					sleep(5000);
					System.out.println("Came out of sleep mode");
					obj.notify();
					System.out.println("call notify");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
	}
	


}
