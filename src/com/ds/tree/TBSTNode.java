package com.ds.tree;

public class TBSTNode {
	
	int ele;
    TBSTNode left, right;
    boolean leftThread, rightThread;
 
    /** Constructor **/
    public TBSTNode(int ele)
    {
        this(ele, null, null, true, true);
    }
 
    /** Constructor **/
    public TBSTNode(boolean leftThread, boolean rightThread)
    {
        this.ele = Integer.MAX_VALUE;
        this.left = this;
        this.right = this;
        this.leftThread = leftThread;
        this.rightThread = rightThread;
    }
 
    /** Constructor **/
    public TBSTNode(int ele, TBSTNode left, TBSTNode right, boolean leftThread, boolean rightThread)
    {
        this.ele = ele;
        this.left = left;
        this.right = right;
        this.leftThread = leftThread;
        this.rightThread = rightThread;
    }

}
