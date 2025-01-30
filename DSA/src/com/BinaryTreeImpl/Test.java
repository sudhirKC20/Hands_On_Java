package com.BinaryTreeImpl;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree b1 = new BinarySearchTree();
		b1.add(50);
		b1.add(30);
		b1.add(60);
		b1.add(10);
		b1.add(35);
		b1.add(55);
		b1.add(70);
		
		System.out.println(b1.size());
		b1.inOrder();
		System.out.println();
		b1.postOrder();
		System.out.println();
		b1.preOrder();
		System.out.println();
		b1.levelOrder();
		System.out.println();
		System.out.println(b1.smallestkey()) ;
		
	}

}
