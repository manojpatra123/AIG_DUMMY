package com.mk.concurrency;

import java.util.concurrent.Exchanger;

/**
 * 
 *
 * @author mpatra
 */

public class ExchangerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Exchanger exchanger = new Exchanger();
		ExchangerTest testObj = new ExchangerTest();
		testObj.test(exchanger);
		 

	}
	
	void test(@SuppressWarnings("rawtypes") Exchanger exchanger){
		ExchangerTask task1 = new ExchangerTask(exchanger,"Apple");
		ExchangerTask task2 = new ExchangerTask(exchanger,"Orange");
		 Thread thd1 = new Thread(task1);
		 Thread thd2 = new Thread(task2);
		 thd1.start();
		 thd2.start();
		System.out.println("Main Thread:" + Thread.currentThread());
	}
	
	class ExchangerTask implements Runnable{
		
		@SuppressWarnings("rawtypes")
		Exchanger exchanger;
		Object obj;
		
		ExchangerTask(@SuppressWarnings("rawtypes") Exchanger exchanger, Object obj){
			this.exchanger = exchanger;
			this.obj = obj;
		}		
		
		@SuppressWarnings("unchecked")
		@Override
		public void run() {
			try {
				Object currentObj = this.obj;
				this.obj = this.exchanger.exchange(this.obj);
				System.out.println("Replaced:" + currentObj + " with:" + obj + "by:" + Thread.currentThread());
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			
			
		}
		
	}

}
