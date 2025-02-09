package com.SortingAlgo;
import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] a = new int[7];
		System.out.println("Enter the numbers to the array: ");
		 int i=0;
		while(i<a.length) {
			a[i]=s.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void sort(int[] a) {
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp= a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

}
