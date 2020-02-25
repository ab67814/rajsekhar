package com.java.practice.threading;

public class DaemonThread {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new UserThread());
		// Thread currentThread = Thread.currentThread();
		// State state = currentThread.getState();

		t1.setDaemon(true);
		t1.start();
		System.out.println("t1 started");

		/*
		 * while(t1.isAlive()) { System.out.println("t1 is still alive"); }
		 */

	}
}

class UserThread implements Runnable {

	public void run() {
		while (true) {
			processSomething();
		}
	}

	private void processSomething() {
		try {
			Thread.sleep(1000);
			System.out.println("Processing daemon thread");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
