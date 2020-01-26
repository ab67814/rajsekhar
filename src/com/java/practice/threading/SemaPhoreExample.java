package com.java.practice.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaPhoreExample {
	
	static List<String> nameList = new ArrayList<>();
	
	static final int capacity = 1;
	
	static class Worker extends Thread {
		
		private Semaphore sem;
		
		public Worker(Semaphore sem,String name) {
			super(name);
			this.sem = sem;
		}
		
		public void run()  {
			if (this.getName().equals("Producer")) {
				while(true) {
					while (nameList.size()==capacity) {
						try {
							Thread.sleep(0);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					try {
						sem.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					nameList.add("produce");
					System.out.println("added "+nameList.size());
					sem.release();
					/*try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
				}
			} else if(this.getName().equals("Consumer")) {
				while(true) {
					while (nameList.size()==0) {
						try {
							Thread.sleep(0);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					try {
						sem.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					nameList.remove(0);
					System.out.println("removed"+nameList.size());
					sem.release();
					/*try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
				}
				
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		 Semaphore semaphore = new Semaphore(1);
		 
		 Worker producer = new Worker(semaphore, "Producer");
		 Worker consumer = new Worker(semaphore, "Consumer");
		 
		 producer.start();
		 consumer.start();
		 
		 producer.join();
		 consumer.join();
		
		 System.out.println("Finished");
	}

}
