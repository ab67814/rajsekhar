package com.ds.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	 void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        boolean swapped=true;
	        for (int i = 0; (i < n-1) && swapped; i++){
	        	swapped=false;
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                    swapped=true;
	                }
	    }}
	 
	    /* Prints the array */
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    // Driver method to test above
	    public static void main(String args[])
	    {
	    	int noOfElem;
	    	int arr[];
	    	Scanner scanner = new Scanner(System.in);
	        BubbleSort ob = new BubbleSort();
	        System.out.println("enter no of elements");
	        noOfElem = scanner.nextInt();
	        arr = new int[noOfElem];
	        System.out.println("Enter the elements below");
	        for (int i=0; i<noOfElem; i++) {
	        	arr[i] = scanner.nextInt();
 	        }
	        ob.bubbleSort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	        scanner.close();
	    }
}


