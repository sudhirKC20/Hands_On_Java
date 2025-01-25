package com.StringPrograms;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		System.out.println(s);
		int a = s.length();
		System.out.println("The reverse of the entered string is: \n");
		while(a-->0) {
			System.out.print(s.charAt(a));
		}
		
		
		
	}

}
