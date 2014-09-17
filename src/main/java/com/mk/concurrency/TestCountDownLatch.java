package com.mk.concurrency;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		Thread dbService = new Thread(new Service(10, latch, "DB Service"));
		Thread webService = new Thread(new Service(5000, latch, "Web Service"));
		Thread appService = new Thread(new Service(9500, latch, "Application Service"));
		String str = new String("Hello");
		
		try {
			dbService.start();
			webService.start();
			appService.start();
			latch.await();
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		System.out.println("Application is ready to use!!");

	}

}
