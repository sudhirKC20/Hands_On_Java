package com.StringPrograms;

public class Reverse {

		public static void main(String[] args) {
			String s = "Java is very easy";
			System.out.println(rev(s));
			
		}
		public static String rev(String s) {
				
			int i= s.length()-1;
			int j= s.length();
			String s2 ="";
			while(i>=0 ) {
				while(i>=0 && s.charAt(i)!=' ') i--;
				int k=i+1;
				while(k<j) {
					s2+=s.charAt(k);
					k++;
				}
				if(i>=0) s2+=" ";
				j=i;
				i--;
			}
			return s2;
		}

}

