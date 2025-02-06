package com.DoubleLinkedListimpl;

public class Test {

	public static void main(String[] args) {
		DoubleLinkedList d = new DoubleLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(3,70);
		
		for(int i=0; i<d.size(); i++) {
			System.out.print(d.get(i)+" ");
		}
		System.out.println();
		d.add(0,80);
		for(int i=0; i<d.size(); i++)
			System.out.print(d.get(i)+" ");
		System.out.println();
		d.remove(6);
		for(int i=0; i<d.size(); i++) {
			System.out.print(d.get(i)+" ");
		}
		System.out.println();
		d.reverse();
		for(int i=0; i<d.size(); i++) {
			System.out.print(d.get(i)+" ");
		}
	}

}
