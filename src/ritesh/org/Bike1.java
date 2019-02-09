package ritesh.org;
class Vehicle{  
 final int speed=50; 
  Vehicle(){
	  System.out.println("super class");
  }
}  
  
class Bike4 extends Vehicle{
	

  int speed=100; 
  
   Bike4() {
	   super();
   }
   
  void display(){  
   System.out.println(speed);//will print speed of Vehicle now  
  }}
class Bike1{
	
  public static void main(String args[]){  
   Bike4 b=new Bike4();  
   b.display();  
     
}  
}  