package ritesh.org;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
	String string;
	public Serialization(int i, String string) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.string = string;
	}

	public static void main(String args[])throws Exception{  
		Serialization s1 =new Serialization(211,"ravi");  
		  
		  FileOutputStream fout=new FileOutputStream("D:/f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success"); 
		  out.close();
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/f.txt"));  
		  Serialization s=(Serialization)in.readObject();  
		  System.out.println(s.i+" "+s.string);  
		  
		  in.close();  
		 }  

}
