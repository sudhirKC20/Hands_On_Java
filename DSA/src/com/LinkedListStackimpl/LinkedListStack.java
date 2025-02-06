package com.LinkedListStackimpl;

import java.util.EmptyStackException;

public class LinkedListStack {
	private Node first = null;
	private int count=0;
	
	public void push(Object e) {
		if(first==null) 
		{
			first =new Node(e,null);
			count++;
			return;
		}
		first = new Node(e,first);	
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public Object pop() {
		if(isEmpty()) throw new EmptyStackException();
		
		Object e = first.ele;
		first = first.next;
		count--;
		return e;
		
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();
		
		return first.ele;

	}
	
}
