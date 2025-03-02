package com.DoubleLinkedListimpl;

public class Node {
	Object ele;
	Node prev;
	Node next;

	Node(Object e) {
		ele = e;
	}
	Node(Object e, Node p, Node n) {
		ele = e;
		prev = p;
		next = n;
		
	}

}
