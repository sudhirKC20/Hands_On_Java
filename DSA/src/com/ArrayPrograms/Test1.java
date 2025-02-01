package com.ArrayPrograms;

public class Test1 {
	public static void main(String[] args) {
		int[] a= {4,5,7,2,8,1,9};
		int smallest = a[0];
		int biggest = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
			if(a[i]>biggest) {
				biggest = a[i];
			}
		}
		System.out.println("smallest ="+smallest);

		System.out.println("biggest ="+biggest);
}

}
