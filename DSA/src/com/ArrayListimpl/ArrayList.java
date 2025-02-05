package com.ArrayListimpl;

public class ArrayList {
	Object[] a = new Object[5];
	int c=0;
	
	public void add(Object e) {
		if(c>=a.length) increase();
		a[c++]=e;
	}
	
	public void add(int index, Object e) {
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(c>=a.length) increase();
		for(int i=size()-1; i>=index; i--) {
			a[i+1]= a[i];
		}
		a[index]=e;
		c++;
	}
	
	public int size() {
		return c;
	}
	
	public void increase() {
		Object[] temp = new Object[a.length+3];
		for(int i=0; i<a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	
	public Object get(int index) {
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	public void remove(int index) {
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i = index+1; i<size(); i++) {
			a[i-1] = a[i];
		}
		c--;
		a[c]=null;
	}
	

}
