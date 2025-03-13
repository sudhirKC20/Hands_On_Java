package com.PatternPrograms;
import java.util.*;

public class DiamondPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n= s.nextInt();
		int star=1, space = n/2;
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				space--;
				star+=2;
			}else {
				star-=2;
				space++;
			}
			
		}

	}

}
