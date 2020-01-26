package com.java.practice.threading;

public class RunnableThread implements Runnable {

	public static void main(String[] args) {
		Thread runnableThread = new Thread(new RunnableThread(), "first Thread");
		Thread anotherRunnable = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("another runnable thread: " + Thread.currentThread().getName());
			}
		},"second Thread");
		anotherRunnable.start();
		runnableThread.start();

	}

	@Override
	public void run() {
		System.out.println("started thread :" + Thread.currentThread().getName());
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
