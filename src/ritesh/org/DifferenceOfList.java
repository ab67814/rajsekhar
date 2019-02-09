package ritesh.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferenceOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings to insert");
		int firstStringsCount = sc.nextInt();
		System.out.println("Please input the first List");
		List<String> firstList = new ArrayList<String>();
		for (int i=0;i<firstStringsCount;i++) {
			firstList.add(sc.next());
		}
		System.out.println("Enter the no of strings to insert");
		int scndStringsCount = sc.nextInt();
		System.out.println("Please input the Second List");
		List<String> secondList = new ArrayList<String>();
		for (int i=0;i<scndStringsCount;i++) {
			secondList.add(sc.next());
		}
		sc.close();
        
		if (firstList.size() != secondList.size()) {
			if (secondList.size() > firstList.size()) {
				secondList.removeAll(firstList);
				System.out.println(secondList);
			} else  {
				firstList.removeAll(secondList);
				System.out.println(firstList);
			}
		} else {
			System.out.println("Both the List are of same size");
		}
		
	}
}
