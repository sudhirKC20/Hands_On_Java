package com.StringPrograms;

import java.util.Arrays;
import java.util.List;

public class MissingNums {

	public static void main(String[] args) {
		Integer[] arr = {1,3,5,7};
		List<Integer> l1 = Arrays.asList(arr);
		
		int max = arr[0], min = arr[0];
		
		for(Integer i : arr) {
			if(i>max) max=i;
			else if(i<min) min=i;
		}
		
		for(int i=min; i<max; i++) {
			if(!l1.contains(i)) System.out.println(i);
		}
	}

}
