package com.ds.tree;

import java.util.Scanner;

public class ThreadedBinarySearchTreeTest {
	
	public static void main(String[] args)
    {                 
        Scanner scan = new Scanner(System.in);
        /** Creating object of ThreadedBinarySearchTree **/
        ThreadedBinarySearchTree tbst = new ThreadedBinarySearchTree(); 
        System.out.println("Threaded Binary Search Tree Test\n");          
        char ch;
        /**  Perform tree operations  **/
        do    
        {
            System.out.println("\nThreaded Binary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. clear"); 
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                tbst.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ tbst.search( scan.nextInt() ));
                break;       
            case 3 : 
                System.out.println("\nTree Cleared\n");
                tbst.clear();
                break;           
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /**  Display tree  **/ 
            System.out.print("\nTree = ");
            tbst.inOrder();            
            System.out.println();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
      scan.close();
    }

}
