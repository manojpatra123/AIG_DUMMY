package com.mk.concurrency;

import java.util.concurrent.CountDownLatch;

public class Service implements Runnable {
	
	final int timeToStart;
	final CountDownLatch latch;
	final String serviceName;
	
	public Service(int timeToStart, CountDownLatch latch, String serviceName) {
		super();
		this.timeToStart = timeToStart;
		this.latch = latch;
		this.serviceName = serviceName;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(serviceName + " started..");
		latch.countDown();

	}

}
