package com.ds.stack;

import java.util.NoSuchElementException;

import com.ds.linkedList.Node;

public class LinkedStack {
	
	Node top;
	int size;
	
	/*  Constructor  */
    public LinkedStack()
    {
        top = null;
        size = 0;
    }   

	public void push(int nextInt) {
		Node nptr = new Node(nextInt,null);
		if (top == null)
			top = nptr;
		else {
			nptr.setLink(top);
			top = nptr;
		}
		size ++;
	}

	public int pop() {
		if (isEmpty()) 
			throw new NoSuchElementException("Underflow Exception");
		Node ptr = top;
		top = ptr.getLink();
		size --;
		return ptr.getData();
	}

	public boolean isEmpty() {
		
		return top == null;
	}

	public int getSize() {
		return size;
	}

	public void display() {
		System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
	

	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("UnderflowException");
		return top.getData();
	}

}
