package com.ds.searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ds.sorting.QuickSort;

//Java implementation of recursive Binary Search
class BinarySearch
{
 // Returns index of x if it is present in arr[l..r], else
 // return -1
 int binarySearch(int arr[], int l, int r, int x)
 {
     if (r>=l) {
    	 int mid = l+(r-1)/2;
    	 if (arr[mid]==x)
    		 return mid;
    	 if (arr[mid] > x)
    		 return binarySearch(arr, l, mid-1, x);
    	 
    	 return binarySearch(arr, mid+1, r, x);
     }

     // We reach here when element is not present in array
     return -1;
 }

 // Driver method to test above
 public static void main(String args[])
 {
     BinarySearch ob = new BinarySearch();
     Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element");
		int elemCount = sc.nextInt();
		int sortedArray[]= new int[elemCount];
		System.out.println("Enter then elemnt");
		for (int i=0;i< elemCount;i++) {
			sortedArray[i]= sc.nextInt();
		}
		QuickSort quickSort = new QuickSort();
		int arr[] = quickSort.returnSortedArray(sortedArray);
		System.out.println("Sorted array is");
		for (int i=0;i< arr.length;i++) {
			System.out.print("\t"+arr[i]);
		}
		System.out.println("");
		System.out.println("Enter the Key Element to search");
		int x = sc.nextInt();
     int n = arr.length;
     int result = ob.binarySearch(arr,0,n-1,x);
     if (result == -1)
         System.out.println("Element not present");
     else
         System.out.println("Element found at index "+result);
     sc.close();
     
 }
}