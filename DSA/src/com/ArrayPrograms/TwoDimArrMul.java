package com.ArrayPrograms;

public class TwoDimArrMul {
		public static void main(String[] args) {
			int [][] a = {{1,2,3},
						  {3,2,1},
						  {2,2,1}};
			int [][] b = {{3,2,2},
					      {1,1,2},
					      {2,1,1}};
			int [][] c = multiply(a,b);
			for(int i=0; i<c.length; i++)
			{
				for(int j=0; j<c[i].length; j++) {
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		public static int[][] multiply(int[][] a, int[][] b){
			int len=a.length;
			int[][] c = new int[len][len];
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					for(int k=0; k<len; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
					
				}
			}
			return c;
		}

}

	
	


