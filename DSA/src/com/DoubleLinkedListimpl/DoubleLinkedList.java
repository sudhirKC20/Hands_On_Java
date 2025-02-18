package com.DoubleLinkedListimpl;

public class DoubleLinkedList {
	private Node first=null;
	private int count = 0;
	
	public int size() {
		return count;
	}
	
	public void add(Object e) {
		if(first==null) {
			first = new Node(e,null,null);
			count++;
			return;
		}
		Node curr = first;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next=new Node(e,curr,null);
		count++;
		
	}
	
	public void add(int index, Object e) {
		if(index <= -1 || index >= size()) throw new IndexOutOfBoundsException();
		
		if(index==0) {
			Node n=new Node(e,null,first);
			first.prev=n;
			first = n;
			count++;
			return;
		}
		
		Node curr = first;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next =new Node(e,curr, curr.next);
		curr.next.next.prev=curr.next;
		count++;
	}
	
	public Object get(int index) {
		if(index <= -1 || index >= size()) throw new IndexOutOfBoundsException();
		
		Node curr = first;
		for(int i=1; i<=index; i++) {
			curr=curr.next;
		}
		return curr.ele;
		
	}
	
	public void remove(int index) {
		if(index <= -1 || index >= size()) throw new IndexOutOfBoundsException();

		if(index==0) {
			first = first.next;
			if(first!=null) first.prev = null;
			count--;
			return;
		}
		
		Node curr = first;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next!=null) curr.next.prev=curr;
		count--;
		
	}
	
	public void reverse() {
		Node prev=null, curr = first, next= null;
		while(curr!=null) {
			next=curr.next;
			curr.prev=next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}

}
