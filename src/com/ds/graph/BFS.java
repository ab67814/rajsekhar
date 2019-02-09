package com.ds.graph;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class BFS
{ 
 
    private Queue<Integer> queue;
 
    public BFS()
    {
        queue = new LinkedList<Integer>();
    }
 
    public void bfs(int adjacency_matrix[][], int source)
    {
    	int nodesNumber = adjacency_matrix.length;
    	int visitedVertex[] = new int[nodesNumber];
    	Integer element = new Integer(source);
    	queue.add(element);
    	System.out.println("\t Visited Graph");
    	System.out.println();
    	while (!queue.isEmpty()) {
    		int removedElem = queue.remove();
    			
    			visitedVertex[removedElem] = 1;
    			System.out.print(removedElem+"\t");
    			
    			for (int i = 1;i < nodesNumber ; i++) {
    				if (adjacency_matrix[removedElem][i] == 1 && visitedVertex[i] == 0) {
    					queue.add(Integer.valueOf(i));
    				}
    			}
    			
    	}
    }
 
    public static void main(String... arg)
    {
        int number_no_nodes, source;
        Scanner scanner = null;
 
        try
        {
            System.out.println("Enter the number of nodes in the graph");
            scanner = new Scanner(System.in);
            number_no_nodes = scanner.nextInt();
 
            int adjacency_matrix[][] = new int[number_no_nodes + 1][number_no_nodes + 1];
            System.out.println("Enter the adjacency matrix");
            for (int i = 1; i <= number_no_nodes; i++)
                for (int j = 1; j <= number_no_nodes; j++)
                    adjacency_matrix[i][j] = scanner.nextInt();
 
            System.out.println("Enter the source for the graph");
            source = scanner.nextInt();
 
            System.out.println("The BFS traversal of the graph is ");
            BFS bfs = new BFS();
            bfs.bfs(adjacency_matrix, source);
 
        } catch (InputMismatchException inputMismatch)
        {
            System.out.println("Wrong Input Format");
        }
        scanner.close();
    }
}

