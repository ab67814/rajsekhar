package com.java.practice.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        //Thread.sleep(1000);
        System.out.println("............");
        return Thread.currentThread().getName();
    }
    
    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new FutureCallable();
        for(int i=0; i< 100; i++){
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            list.add(future);
        }
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        int i=0;
        for(Future<String> fut : list){	
            try {
                System.out.println(i+++"  "+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

}

