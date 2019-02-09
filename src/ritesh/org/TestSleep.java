package ritesh.org;

class TestSleep extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	    System.out.println(Thread.currentThread().getName());
	  }  
	 }  
	 public static void main(String args[]){  
	  TestSleep t1=new TestSleep();  
	  TestSleep t2=new TestSleep();  
      
	  t1.start();  
	/*  try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	 //System.out.println(t1.getName()); 
	// System.out.println(t2.getId());
	  t2.start(); 
	  Thread t3=new Thread(){
	   public void run(){
		  System.out.println("task 3 completes");
	  }};
	  t3.start();
	 }  
	}  