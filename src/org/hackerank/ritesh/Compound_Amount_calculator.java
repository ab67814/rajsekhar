package org.hackerank.ritesh;


import java.util.Scanner;

public class Compound_Amount_calculator {
	
   public static double compoundamount(double pamnt,float ten,float roi,int n){
	   double amount=0;
	   double intamount=Math.pow((1+(roi/(100*n))),(ten*n) );
	   amount=pamnt*intamount;
	   return amount;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Please give the Principal Amount : ");
	    double principalAmount=sc.nextDouble();
	    System.out.print("Tenure : ");
	    float tenure = sc.nextFloat();
	    System.out.print("Rate of Interest : ");
	    float rateofinterst = sc.nextFloat();
	    System.out.print("Compound per Year : ");
	    int nooftimes = sc.nextInt();
	    double amount=compoundamount(principalAmount,tenure,rateofinterst,nooftimes);
	    System.out.println("The Compound amount is : "+amount);
	    
	    
        sc.close();
	}

}
