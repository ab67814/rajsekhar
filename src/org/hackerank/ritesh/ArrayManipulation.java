package org.hackerank.ritesh;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArrayManipulation {

    /*
     * Complete the arrayManipulation function below.
     */
	 /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation(int n, int[][] queries) {
        long arrayList[] = new long[n];
        for(int arrayListItr=0;arrayListItr<n;arrayListItr++){
            arrayList[arrayListItr]=0;
        }
        for(int queriesRowItr=0; queriesRowItr < queries.length; queriesRowItr++){
            int lower = queries[queriesRowItr][0]-1;
            int upper = queries[queriesRowItr][1];
            long sum = queries[queriesRowItr][2];
            arrayList[lower]+=sum;
            if(upper<n)
            	arrayList[upper]-=sum; 
       }
        
        long max=0;
        long temp=0;

        for(int i=0;i<n;i++){
            temp += arrayList[i];
            if(temp> max) max=temp;
        }
        
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}

