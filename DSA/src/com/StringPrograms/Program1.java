package com.StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		String[] a = {"race", "care", "bus", "usb", "hbvf", "hjsbv", "yewg"};
		List<String> l1 = new ArrayList();
		List l2 = new ArrayList();
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]=="" || a[j]=="") continue;
				if(anagram(a[i], a[j])) {
					l1.add(a[i]);
					l1.add(a[j]);
					a[j]=a[i]="";
				}else {
					l2.add(a[i]);
				}	
			}
		}
		System.out.println("The anagram strings are:");
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("The non anagram strings are: ");
		for(int i=0; i<l2.size(); i++) {
			System.out.println(l2.get(i));
		}
		
	}
	
	public static boolean anagram(String s1, String s2 ) {
		while(true) {
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0 && s2.length()==0) return true;
			char c = s1.charAt(0);
			s1 = s1.replace(c + "", "");
			s2 = s2.replace(c+"", "");
		}
	}

}
