package ritesh.org;

import java.io.IOException;



public class Insert {

	int rollno;
	String name;
	public Insert(int r,String n) {
		// TODO Auto-generated constructor stub
		rollno=r;
		name=n;
	}
	
	 void Display()
	{
		System.out.println(rollno+"\t" +name);
	}
	 
	 void getUsername(String name) {
		 System.out.println(rollno);
	 }
	 
	 void getUsername(int rollno) {
		 System.out.println(name);
	 }
	 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Insert i= new Insert(1,"ritesh");
		Insert i1= new Insert(2,"mahesh");
		
		i.Display();
		i1.Display();
		i.getUsername(1);
		i1.getUsername("ritesh");
	}

}
