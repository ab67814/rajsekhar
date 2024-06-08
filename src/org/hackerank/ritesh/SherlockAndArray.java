package org.hackerank.ritesh;

import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int i =0;i<testCase;i++) {
			boolean status = false;
			int arrayLength = sc.nextInt();
			int sherlockArray[] = new int[arrayLength];
			for (int j=0;j<arrayLength;j++) {
				 sherlockArray[j] = sc.nextInt();
			}
			if (arrayLength==2) {
				status = false;
			}else if(arrayLength==1){
				status = true;
			}else {
				int k =1;
				while(k<arrayLength) {
					int leftTotal=0;
					int rightTotal =0;
					
					for(int l=0;l<arrayLength;l++) {
						if (l<k) {
							leftTotal = leftTotal + sherlockArray[l];
						}else if(l>k) {
							rightTotal = rightTotal + sherlockArray[l];
						}
						
					}
					
					if (leftTotal==rightTotal && leftTotal!=0) {
						status = true;
					}
					k++;
				}
			}
			if (status==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
