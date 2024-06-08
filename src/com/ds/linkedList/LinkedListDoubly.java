package com.ds.linkedList;

public class LinkedListDoubly {
	
	    protected DoublyNode start;
	    protected DoublyNode end ;
	    public int size;
	 
	    /* Constructor */
	    public LinkedListDoubly()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    /* Function to check if list is empty */
	    public boolean isEmpty()
	    {
	        return start == null;
	    }
	    /* Function to get size of list */
	    public int getSize()
	    {
	        return size;
	    }
	    /* Function to insert element at beginning */
	    public void insertAtStart(int val)
	    {
	        DoublyNode nptr = new DoublyNode(val, null, null);        
	        if(start == null)
	        {
	            start = nptr;
	            end = start;
	        }
	        else
	        {
	            start.setLinkPrev(nptr);
	            nptr.setLinkNext(start);
	            start = nptr;
	        }
	        size++;
	    }
	    /* Function to insert element at end */
	    public void insertAtEnd(int val)
	    {
	        DoublyNode nptr = new DoublyNode(val, null, null);        
	        if(start == null)
	        {
	            start = nptr;
	            end = start;
	        }
	        else
	        {
	            nptr.setLinkPrev(end);
	            end.setLinkNext(nptr);
	            end = nptr;
	        }
	        size++;
	    }
	    /* Function to insert element at position */
	    public void insertAtPos(int val , int pos)
	    {
	        DoublyNode nptr = new DoublyNode(val, null, null);    
	        if (pos == 1)
	        {
	            insertAtStart(val);
	            return;
	        }            
	        DoublyNode ptr = start;
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == pos)
	            {
	                DoublyNode tmp = ptr.getLinkNext();
	                ptr.setLinkNext(nptr);
	                nptr.setLinkPrev(ptr);
	                nptr.setLinkNext(tmp);
	                tmp.setLinkPrev(nptr);
	            }
	            ptr = ptr.getLinkNext();            
	        }
	        size++ ;
	    }
	    /* Function to delete DoublyNode at position */
	    public void deleteAtPos(int pos)
	    {        
	        if (pos == 1) 
	        {
	            if (size == 1)
	            {
	                start = null;
	                end = null;
	                size = 0;
	                return; 
	            }
	            start = start.getLinkNext();
	            start.setLinkPrev(null);
	            size--; 
	            return ;
	        }
	        if (pos == size)
	        {
	            end = end.getLinkPrev();
	            end.setLinkNext(null);
	            size-- ;
	        }
	        DoublyNode ptr = start.getLinkNext();
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == pos)
	            {
	                DoublyNode p = ptr.getLinkPrev();
	                DoublyNode n = ptr.getLinkNext();
	 
	                p.setLinkNext(n);
	                n.setLinkPrev(p);
	                size-- ;
	                return;
	            }
	            ptr = ptr.getLinkNext();
	        }        
	    }    
	    /* Function to display status of list */
	    public void display()
	    {
	        System.out.print("\nDoubly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (start.getLinkNext() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        DoublyNode ptr = start;
	        System.out.print(start.getData()+ " <-> ");
	        ptr = start.getLinkNext();
	        while (ptr.getLinkNext() != null)
	        {
	            System.out.print(ptr.getData()+ " <-> ");
	            ptr = ptr.getLinkNext();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
		public void insertAtStartForCircularDoublyLinkedList(int nextInt) {
			DoublyNode nptr = new DoublyNode(nextInt,null,null);
			if (start == null) {
				start = nptr;
				end = start;
				nptr.setLinkNext(nptr);
				nptr.setLinkPrev(nptr);
			} else {
				nptr.setLinkNext(start);
				start.setLinkPrev(nptr);
				end.setLinkNext(nptr);
				nptr.setLinkPrev(end);
				start = nptr;
			}
			size++;
		}
		public void insertAtEndForCircularDoublyLinkedList(int nextInt) {
			DoublyNode nptr = new DoublyNode(nextInt,null,null);

			if (start == null) {
				start = nptr;
				end = start;
				nptr.setLinkNext(nptr);
				nptr.setLinkPrev(nptr);
			} else {
				nptr.setLinkNext(start);
				end.setLinkNext(nptr);
				start.setLinkPrev(nptr);
				nptr.setLinkPrev(end);
				end = nptr;
			}
			size++;
		}
		public void insertAtPosForCircularDoublyLinkedList(int num, int pos) {
			if (pos == 1)
	        {
				insertAtStartForCircularDoublyLinkedList(num);
	            return;
	        }   
			DoublyNode nptr = new DoublyNode(num,null,null);
			DoublyNode ptr= start;
			for (int i=2;i<size;i++) {
				if (i==pos){
					DoublyNode tmp = ptr.getLinkNext();
					nptr.setLinkNext(tmp);
					nptr.setLinkPrev(ptr);
					ptr.setLinkNext(nptr);
					tmp.setLinkPrev(nptr);
					size ++;
					return;
				}
				ptr.getLinkNext();
			}
			
		}
		public void deleteAtPosForCircularDoublyLinkedList(int p) {
			if (p == 1){
	            if (size == 1)
	            {
	                start = null;
	                end = null;
	                size = 0;
	                return; 
	            }
	            start = start.getLinkNext();
	            start.setLinkPrev(end);
	            end.setLinkNext(start);
	            size--; 
	            return ;
	        }
			if (p == size){
				end = end.getLinkPrev();
				end.setLinkNext(start);
				start.setLinkPrev(end);
				size --;
				return;
			} 
			
			DoublyNode ptr = start.getLinkNext();
			for (int i= 2 ;i <size;i++) {
				if (i == p) {
					DoublyNode prev = ptr.getLinkPrev();
					DoublyNode next = ptr.getLinkNext();
					prev.setLinkNext(next);
		            next.setLinkPrev(prev);
		            size-- ;
		            return;
				}
				 ptr = ptr.getLinkNext();
			}
		}
		
		/* Function to display status of list */
	    public void displayForCircular()
	    {
	        System.out.print("\nCircular Doubly Linked List = ");
	        DoublyNode ptr = start;
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (start.getLinkNext() == start) 
	        {
	            System.out.print(start.getData()+ " <-> "+ptr.getData()+ "\n");
	            return;
	        }
	        System.out.print(start.getData()+ " <-> ");
	        ptr = start.getLinkNext();
	        while (ptr.getLinkNext() != start) 
	        {
	            System.out.print(ptr.getData()+ " <-> ");
	            ptr = ptr.getLinkNext();
	        }
	        System.out.print(ptr.getData()+ " <-> ");
	        ptr = ptr.getLinkNext();
	        System.out.print(ptr.getData()+ "\n");
	    }

}
