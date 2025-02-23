package com.ArrayPrograms;
import java.util.Arrays;
public class SwapArray {

	public static void main(String[] args) {
				int[] a= {3,5,2,7,4,8,2,1,5,9,6};
				int start = 0;
				int end = a.length-1;
				System.out.println(Arrays.toString(a));
				
				while(start < end) {
					int temp=a[start];
					a[start]= a[end];
					a[end] = temp;
					start++;
					end--;
				}
				System.err.println(Arrays.toString(a));
	
	}

}
