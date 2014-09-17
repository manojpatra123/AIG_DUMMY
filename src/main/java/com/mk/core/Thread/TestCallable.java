package com.mk.core.Thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec =  Executors.newFixedThreadPool(10);
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		
		for (int i = 0; i < 50; i++) {
			Callable<Long> task = new MyCallable();
			Future<Long> result = exec.submit(task);
			list.add(result);
		}
		long sum = 0;
		System.out.println("*** " + list.size());
		for(Future<Long> future :list){
			try {
				sum += future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		System.out.println("SUM:" + sum);
	}

}
