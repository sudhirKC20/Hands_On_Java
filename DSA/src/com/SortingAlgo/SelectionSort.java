package com.SortingAlgo;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to an array: ");
		int[] a = new int[9];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a) {
		for(int i=0; i<a.length; i++) {
			int index=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[index]) index=j;
			}
			if(i!=index) {
				int temp=a[index];
				a[index] = a[i];
				a[i]=temp;
			}
		}
	}

}
