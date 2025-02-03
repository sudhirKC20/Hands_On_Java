package com.StringPrograms;

public class Panagram {
	public static void main(String[] args) {
		String s = "A Quick Brown Fox jumps Over The Lazy Dog";
		System.out.println(panag(s));;
		
	}
	
	
	public static Boolean panag(String s) {
		if(s.length()<26) return false;
		s=s.toLowerCase();
		for(char ch = 'a'; ch<='z'; ch++) {
			if(!s.contains(ch+"")) return false;
		}
		
		return true;
	}
}
