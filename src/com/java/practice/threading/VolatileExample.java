package com.java.practice.threading;

public class VolatileExample extends Thread {

	private volatile int index;

	public VolatileExample(int index) {
		this.setIndex(index);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			VolatileExample volatileExample = new VolatileExample(i);
			volatileExample.setName(""+i);
			volatileExample.start();
		}

	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" :"+this.getIndex());
		//super.run();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
