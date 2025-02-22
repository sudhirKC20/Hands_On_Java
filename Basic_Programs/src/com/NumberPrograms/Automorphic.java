package com.NumberPrograms;
import java.util.*;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		 int n = sc.nextInt();
		 int temp = n;
		 int sq = n*n;
		 boolean flag = true;
		 
		 while(n!=0) {
			 if(n%10!=sq%10) {
				 flag = false;
				 break;
			 }
			 n/=10;
			 sq/=10;
		 }
		 if(flag) System.out.println(temp + " is an automorphic number.");
		 else System.out.println(temp + " is not an automorphic number.");
		
	}

}
