package ritesh.org;

public class Factorial {
	public Factorial() {
		// TODO Auto-generated constructor stub
		System.out.println("Default call of Factorial constructor method");
	}

	 int fact(int number){
		int f=1;
		for(int i=1;i<=number;i++)
		{
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Factorial f = new Factorial();
  System.out.println("factorial is"+"\t" +f.fact(5));
	}

}
