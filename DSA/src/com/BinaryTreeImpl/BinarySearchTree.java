package com.BinaryTreeImpl;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	int count=0;
	boolean flag;
	
	public boolean add(int key) {
		flag = true;
		root = add(root, key);
		return flag;
		
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public Node add(Node n, int key) {
		if(n==null) {
			n= new Node(key);
			count++;
			return n;
		}
		
		if(key<n.key) n.left=add(n.left, key);
		else if(key>n.key) n.right=add(n.right, key);
		else flag=false;
		return n;
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(Node n) {
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+"\t");
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(Node n) {
		if(n==null) return;
		System.out.print(n.key+"\t");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+"\t");
		inOrder(n.right);
	}
	
	public void levelOrder() {
		
		Queue q = new LinkedList();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) {
			Node n= (Node)q.poll();
			System.out.print(n.key+"\t");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
	}
	
	public boolean contains(int key) {
		return contains(root,key);
	}
	
	private boolean contains(Node n, int key) {
		if(n==null) return false;
		if(key<n.key) return contains(n.left,key);
		else if(key>n.key) return contains(n.right, key);
		else return true;
	}
	
	public int smallestkey() {
		Node n=getMinNode(root);
		return n.key;
	}
	
	private Node getMinNode(Node n) {
		if(n.left==null) return n;
		return getMinNode(n.left);
	}
	
	public int maxkey() {
		Node n = getMaxNode(root);
		return n.key;
	}
	
	private Node getMaxNode(Node n) {
		if(n.right==null) return n;
		return getMaxNode(n.right);
	}
	
//	public void remove(int key) {
//		root = removeNode(root, key);
//	}
//	
//	private Node removeNode(Node n, int key) {
//		if(n==null) return null;
//		if(key<n.key) n.left = removeNode(n.left, key);
//		else if(key>n.key) n.right = removeNode(n.right,key);
//	}
	
	
	
	
	
	
	
	
}
