package com.PatternPrograms;
import java.util.*;

public class DiamondPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n= s.nextInt();
		int star=1, space = n/2;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<space; j++) {
				System.out.println(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.println("*");
				
			}
			
		}

	}

}
