package ritesh.org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class This {
	int id;
	String name;

	This() {
		System.out.println("default constructor is invoked");
	}

	This(int id, String name) {
		this();// it is used to invoked current class constructor.
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		This e1 = new This(111, "karan");
		This e2 = new This(222, "Aryan");
			
		e1.display();
		try {
			e1.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		e2.display();
		immulatbleExample();
		
	}

	private static void immulatbleExample() {
		String s1 = "Hello";
		System.out.println(s1);
		String s2 = s1;
		s1 = "Help!";
		System.out.println(s1);
		System.out.println(s2);
	}
}
