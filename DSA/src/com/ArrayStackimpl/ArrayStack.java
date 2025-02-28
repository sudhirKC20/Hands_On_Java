package com.ArrayStackimpl;

import java.util.EmptyStackException;

public class ArrayStack {
	private Object[] a = new Object[5];
	private int c = 0;
	
	public int size() {
		return c;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void push(Object e) {
		if(c>=a.length) increase();
		a[c++]=e;
	}
	
	public Object pop() {
		if(isEmpty()) throw new EmptyStackException();
		c--;
		Object e= a[c];
		a[c]=null;
		return e;
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();

		return a[c-1];
	}
	
	public void increase() {
		Object [] temp= new Object[a.length+3];
		for(int i=0; i<a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
}
