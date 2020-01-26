package com.java.practice.threading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	
	private static Map<Integer,Double> map = new HashMap<>();
	
	static Map<Integer,Double> getMap () {
		return map;
	}
	
	static {
		for(int i=0;i<100;i++) {
			map.put(i, Math.random() * 10000 + 1);
		}
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 100; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
		
		 
		
	}

}
