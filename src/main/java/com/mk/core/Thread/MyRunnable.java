package com.mk.core.Thread;

public class MyRunnable implements Runnable {

	int count;	
	public MyRunnable(int count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += i;						
		}
		System.out.println("SUM for: " + count + "is :" + sum );

	}

}
