package com.ArrayListimpl;

public class Test {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(2,60);
		System.out.println("Size of the arraylist is :"+ l.size());
		for (int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+"\t");
		}

	}

}
