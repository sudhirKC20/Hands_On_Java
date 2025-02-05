package com.LinkedListimpl;

public class Node {
	Object ele;
	Node next;
	Node(Object e){
		ele=e;
	}
	Node(Object e, Node n){
		ele =e;
		next = n;
	}
}
