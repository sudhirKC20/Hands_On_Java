package com.LinkedListimpl;

public class Test {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(3,70);
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l.remove(4);
		System.out.println(l.size());
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l.reverse();
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
	}

}
