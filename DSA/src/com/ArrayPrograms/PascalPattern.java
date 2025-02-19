package com.ArrayPrograms;
import java.util.*;

public class PascalPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of pascal triangle:");
		int a = s.nextInt();
		int[][] b = pascal(a);
		
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < b[i].length; j++) {

				System.out.print(b[i][j] + " ");
			}
			System.out.println();

		}

	}
	

	public static int[][] pascal(int size) {
		int[][] a = new int[size][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || i == j)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

			}
		}
		return a;
	}

}

