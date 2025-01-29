package com.ArrayPrograms;

import java.util.*;

//		WAP to print the sum of even index values sum and odd index values sum in an array.

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values to the array: ");
		int[] a = new int[5];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt(); 
		}
		System.out.println(Arrays.toString(a));
		int i=0, sum =0, sum1=0;
		while(i<a.length) {
			if(i%2==0) sum+=a[i];
			else sum1+=a[i];
			i++;
		}
		System.out.println("The sum of even index values is "+sum+"\nThe sum of odd index value is "+sum1);

	}

}
