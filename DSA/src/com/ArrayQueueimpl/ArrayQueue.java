package com.ArrayQueueimpl;

public class ArrayQueue {
	private Object[] a = new Object[5];
	private int c=0;
	
	public void add(Object e) {
		if(c>=a.length) increase();
		a[c++]=e;
	}
	
	public void increase() {
		Object[] temp = new Object[a.length+3];
		for(int i=0; i<a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public int size() {
		return c;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public Object poll() {
		if(isEmpty())  return null;
		Object e = a[0];
		for(int i=1; i<size(); i++) {
			a[i-1]=a[i];
		}
		c--;
		a[c]=null;
		return e;
	}
	
	public Object peek() {
		if(isEmpty())  return null;
		return a[0];
	}
}
