package com.LinkedListStackimpl;

public class Test {

	public static void main(String[] args) {
		LinkedListStack l = new LinkedListStack();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.push(50);
		l.push(60);
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.peek());

	}

}
