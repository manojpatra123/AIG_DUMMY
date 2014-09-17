package com.mk.core.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecuter {

	public TestExecuter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 50; i++) {
			Runnable task = new MyRunnable(i);
			exec.execute(task);
		}
		
				exec.shutdown();
				try {
					exec.awaitTermination(1, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println("Finished");
		
	}

}
