package com.ds.threading;

public class Thread {

	public static void main(String[] args) {
		java.lang.Thread t = new java.lang.Thread(new Runnable(){
		    @Override
		    public void run() {
		    	System.out.println("inside Run");
		    }
		});
		java.lang.Thread t1 = new java.lang.Thread(()->{
			System.out.println("inside Run1");
		});
		
		t.run();
		
		
		t1.run();
		System.out.println("Thread Name"+t.getName());

	}

}
