package com.mk.core.Thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

	@Override
	public Long call() throws Exception {
		Long sum = new Long(0);
		for (int i = 0; i < 50; i++) {
			sum +=i;			
		}
		return sum;
	}

}
