package com.java.practice.threading;

public class ThreadLocals implements Runnable {
	
	private ThreadLocal<Integer> myThreadLocal = new ThreadLocal<Integer>();

	public static void main(String[] args) throws InterruptedException {
		ThreadLocals obj = new ThreadLocals();
        for(int i=0 ; i<10; i++){
            Thread t = new Thread(obj, ""+i);
            t.start();
        }
	}

	@Override
	public void run() {
		myThreadLocal.set( (int) (Math.random() * 100D) );
		System.out.println(myThreadLocal.get()+" id"+myThreadLocal.toString());
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
	}

}
