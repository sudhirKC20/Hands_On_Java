package com.StringPrograms;

public class RotateRecur {

	public static void main(String[] args) {
		char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		rotate(a,3);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
	}
	
	public static void rotate(char[] a, int key) {
		rotate(a, 0, key, a[0], 0);
	}
	
	public static void rotate(char[] s,int index, int key,char temp, int count) {
		if(count==s.length) return;
		int j=index+key;
		char temp1;
		
		if(j>=s.length) {
			j=j-s.length;
			temp1 = s[j];
			s[j]=temp;
		}else {
			temp1 = s[j];
			s[j]=temp;
		}
		 rotate(s, j, key, temp1, count+1);
		
	}

}
