package org.hackerearth.ritesh;


import java.util.Scanner;
class MonkndMultiplication {
	
    public static void main(String args[] ) throws Exception, ArrayIndexOutOfBoundsException {
             

Scanner sc=new Scanner(System.in);
int[] L= new int[10];
int N=0;
 
System.out.println(" No of input");
N=sc.nextInt();

for(int k=0;k<=N-1;k++){
	//1 2 3 4 5
	if(k==0||k==1){
		L[k]=sc.nextInt();
		//number=L[k];
		System.out.println("-1");
	}
	else if(N==3){
		 L[k]=sc.nextInt();
		 int number=L[k];
			
			int number1=L[k-1];
			number=number*number1;
			System.out.println(number);
		
	
	}
	
	else {
		 L[k]=sc.nextInt();
		 int number=1;
		for(int i=k;i>k-3;i--){
			
			int number1=L[i];
			number=number*number1;
			
		
	}
		System.out.println(number);
	}

}

sc.close();

}
}

