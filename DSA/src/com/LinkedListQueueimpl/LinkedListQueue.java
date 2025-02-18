package com.LinkedListQueueimpl;

public class LinkedListQueue {
	private Node first =null;
	private int c = 0;
	
	public void add(Object e) {
		if(first==null) {
			first = new Node(e, null);
			c++;
			return;
		}
		
		Node curr = first;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next=new Node(e,null);
		c++;
	}
	
	public Object poll() {
		if(isEmpty()) return null;
		
		Object e = first.ele;
		first = first.next;
		c--;
		return e;
		
	}
	
	public Object peek() {
		if(isEmpty()) return null;
		return first.ele;
		
	}
	
	public int size() {
		return c;
		
	}
	
	public boolean isEmpty() {
		return size()==0;
		
	}
	
	
}
