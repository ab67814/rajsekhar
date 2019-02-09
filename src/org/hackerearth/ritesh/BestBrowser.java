package org.hackerearth.ritesh;

import java.util.Scanner;

public class BestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int noofElement=sc.nextInt();
		for(int i=0;i<noofElement;i++){
			String siteName=sc.next();
			int indexOfDot=siteName.indexOf(".");
			int c=0;
			for(int j=indexOfDot+1;j<siteName.lastIndexOf(".");j++){
				char ch=siteName.charAt(j);
				if(ch=='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u'){
	
				}
				else{
					c++;
				}
				
				
			}
			System.out.println((c+4)+"/"+siteName.length());
		}
		sc.close();
	}

}
