package com.ds.linkedList;

public class DoublyNode {
	
	    protected int data;
	    protected DoublyNode next, prev;
	 
	    /* Constructor */
	    public DoublyNode()
	    {
	        next = null;
	        prev = null;
	        data = 0;
	    }
	    /* Constructor */
	    public DoublyNode(int d, DoublyNode n, DoublyNode p)
	    {
	        data = d;
	        next = n;
	        prev = p;
	    }
	    /* Function to set link to next node */
	    public void setLinkNext(DoublyNode n)
	    {
	        next = n;
	    }
	    /* Function to set link to previous node */
	    public void setLinkPrev(DoublyNode p)
	    {
	        prev = p;
	    }    
	    /* Funtion to get link to next node */
	    public DoublyNode getLinkNext()
	    {
	        return next;
	    }
	    /* Function to get link to previous node */
	    public DoublyNode getLinkPrev()
	    {
	        return prev;
	    }
	    /* Function to set data to node */
	    public void setData(int d)
	    {
	        data = d;
	    }
	    /* Function to get data from node */
	    public int getData()
	    {
	        return data;
	    }

}
