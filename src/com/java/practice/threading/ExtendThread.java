package com.java.practice.threading;

public class ExtendThread extends Thread {
	
	private static int count=0;
	
	public static void increment() {
			
			System.out.println(++count);
		}
	public ExtendThread(String name) {
		super(name);
	}
	
	@Override
	public void run()
    {
		for (int i=0;i<5;i++) {
			ExtendThread.increment();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runing this :"+Thread.currentThread().getName()+"with state "+Thread.currentThread().getState()+" "+i);
		}
    }
	

	public static void main(String[] args) {
		ExtendThread first = new ExtendThread("first");
		ExtendThread secnd = new ExtendThread("secnd");
		first.start();
		
		try {
			first.join(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		secnd.start();
	}

}
