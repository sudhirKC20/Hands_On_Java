package com.StringPrograms;

public class Anagram {
		public static void main(String[] args) {
			String s1 = "race";
			String s2 = "care";
			if(check(s1,s2)) System.out.println("Anagram");
		}
		public static Boolean check(String s1, String s2) {
			while(true) {
				if(s1.length()!=s2.length()) return false;
				if(s1.length()==0 && s2.length()==0) return true;
				char c= s1.charAt(0);
				s1=s1.replace(c+"","");
				s2=s2.replace(c+"","");			
			}
		}

	}
