package com.StringPrograms;

public class Rotate {

	public static void main(String[] args) {
		String s = "sudhirkumar";
		//char[] ch = s.toCharArray();
		 
		rotate(s,5);

	}
	public static void rotate(String s, int key) {
		if(key<0) return;
		char[] ch = s.toCharArray();
		char[] temp = new char[ch.length];
		for(int i=0; i<ch.length; i++) {
			int j=i+key;
			if(j>=ch.length) {
				j=j-ch.length;
				temp[j]=ch[i];
//				System.out.println(j+" "+temp[j]);
			}else {
				temp[j]=ch[i];
//				System.out.println(j+" "+temp[j]);
			}
		}
			
			for(int i=0; i<temp.length; i++) {
				System.out.print(temp[i]);
			}
			
		}
}
