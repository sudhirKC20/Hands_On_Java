package com.SortingAlgo;
import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to the array: ");
		int[] a = new int[9];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void sort(int[] a) {
		sort(a,0,a.length-1);
	}
	public static void sort(int[]a, int start, int end) {
		if(start>=end) return;
		int pivot = a[(start+end)/2];
		int i=start, j=end;
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp= a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}

}
