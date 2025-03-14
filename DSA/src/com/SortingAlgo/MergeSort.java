package com.SortingAlgo;

import java.util.*;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//to take user input
		System.out.println("Enter the size of the array: ");
		int[] a = new int[size];
		
		System.out.println("Enter the numbers to the array: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Before Sorting: ");
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(a));
	}

	//sort method to divide each array to the smallest component like single array
	public static void sort(int[] a) {
		//base case
		if(a.length==1) return;
		//dividing in two part
		int[] left = new int[a.length/2];
		int[] right = new int[a.length-left.length];

		//copying the items from the original array to the left element
		for(int i=0; i<left.length; i++) {
			left[i] = a[i];
		}
		
		//copying the items from the original array to the right element
		for(int j=0; j<right.length; j++) {
			right[j]=a[j+left.length];
		}
		
		sort(left);
		sort(right);
		merge(left,right,a);
	}

	//after dividing them we are sorting and merging them back
	public static void merge(int[]a, int[]b, int[]c) {
		int i=0, j=0, k=0;
		//iterating till the elements present in the array
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		//checking if any elements left in the array and storing in the resultant array
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
	}
}
