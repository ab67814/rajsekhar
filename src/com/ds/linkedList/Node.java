package com.ds.linkedList;

public class Node {
	
	protected int data;
    protected Node link;
    
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the link
	 */
	public Node getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(Node link) {
		this.link = link;
	}    


}
