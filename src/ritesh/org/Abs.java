package ritesh.org;
 abstract class Bike{ 
	private String BykeName; 
   Bike(){System.out.println("bike is created");}  
   abstract void run();
   static int  test(){
	  return 0; 
   }
   
   void changeGear(){System.out.println("gear changed");}  
 }  
  
 class Honda extends Bike{  
 void run(){System.out.println("Honda byke running safely..");} 
 static int test() {
	 return 1;
 }
 }  
 class Bajaj extends Bike{
	 void run(){
		 System.out.println("Bajaj byke running safely...");
	 }
	 static int test() {
		 return 2;
	 }

 }
 class Abs{  
 public static void main(String args[]){  
  Bike obj = new Honda(); //every time initialising this calls constructor method 
  obj.run();  
  obj.changeGear(); 
  System.out.println("/// Parent call"+Bike.test());
  System.out.println(obj.test());
  Bajaj obj1 = new Bajaj();
  System.out.println(obj1.test());
  
  
 }  
}  