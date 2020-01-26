package com.java.practice.threading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.java.practice.collections.Insurance;

public class ReentrantLocksTest implements Runnable {

	private static Insurance insurance = new Insurance("abhi", "health");
	private static int count = 0;
	private Lock renterentLock = new ReentrantLock(true);

	public static void main(String[] args) {
		ReentrantLocksTest locksTest = new ReentrantLocksTest();
		Thread th1 = new Thread(locksTest, "th1");
		Thread th2 = new Thread(locksTest, "th2");
		Thread th3 = new Thread(locksTest, "th3");

		th1.start();
		th2.start();
		th3.start();

	}

	// synchronise example
	/*@Override
	public void run() {
		synchronized (insurance) {
			count++;
			System.out.println(Thread.currentThread().getName() + "inside run" + count);
			insurance.getName();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}*/

	// reentrant example

	@Override
	public void run() {
		//renterentLock.lock();
		try {
			if(renterentLock.tryLock(10, TimeUnit.SECONDS)) {
				System.out.println("done "+Thread.currentThread().getName());
			}
			count++;
			//renterentLock.lockInterruptibly();
			System.out.println(Thread.currentThread().getName() + "inside run" +count);
			insurance.getName();
			Thread.sleep(1000);
		} catch (InterruptedException |  SecurityException e1) {
			e1.printStackTrace();
		} finally {
			renterentLock.unlock();
		}
		//renterentLock.unlock();
	}

}
