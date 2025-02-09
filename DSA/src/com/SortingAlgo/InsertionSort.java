package com.SortingAlgo;
import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers to the array: ");
		int[] a = new int[9];
		for(int i=0;i<a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
		
	}
	
	public static void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int key = a[i+1];
			int j=i;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
