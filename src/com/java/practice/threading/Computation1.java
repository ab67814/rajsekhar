package com.java.practice.threading;

import java.util.concurrent.BrokenBarrierException;

class Computation1 implements Runnable 
{ 
    public static int product = 0; 
    public void run() 
    { 
        product = 2 * 3; 
        try
        { 
        	System.out.println("waiting comp1 "+ CyclicBarrierTest.newBarrier.getNumberWaiting());

            CyclicBarrierTest.newBarrier.await(); 
            System.out.println("access");
        }  
        catch (InterruptedException | BrokenBarrierException e)  
        { 
            e.printStackTrace(); 
        } 
    } 
} 