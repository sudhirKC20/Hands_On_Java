package com.ArrayPrograms;

import java.util.Arrays;

public class Program3 {

	// WAP to print the prime numbers present in an array.
	
	public static void main(String[] args) {
			
		int[] a = {78,2,45,67,4,6,8,23,54,98};
		System.out.println("The current array is\n"+Arrays.toString(a));
		System.out.println("The prime numbers are: ");
		for(int i=0; i<a.length; i++) {
			if(prime(a[i])) System.out.print(a[i]+" "); 
		}
	}
	
	public static boolean prime(int n) {
		return prime(n,n/2);
	}
	
	public static boolean prime(int n, int i) {
		if(n<=1) return false;
		if(i==1) return true;
		if(n%i==0) return false;
		return prime(n,i-1);
	}

}
