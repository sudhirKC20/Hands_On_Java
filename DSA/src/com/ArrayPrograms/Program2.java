package com.ArrayPrograms;


public class Program2 {
	
	//Print the second last element in an array

	public static void main(String[] args) {
		int[] a = {3,5,6,2,1,8,7,6,3,4,45,78};
		for(int i=a.length-1; i>0; i--) {
			if(i==a.length-2) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}
