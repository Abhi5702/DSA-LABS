package com.arrayproblems;

import java.util.Arrays;

//check array is sorted or not 
public class ArraySortedInASC {
	
	public static boolean isSortedASC(int []arr) {
		
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			if(arr[i-1] > arr[i])
				return false;
		}
		return true;
	}
	
	public static void main(String []args) {
		
		int []arr = {10,20,90,50,70,80,90};
		
		System.out.println(Arrays.toString(arr));
		 
		boolean b = isSortedASC(arr);
		System.out.println(b);
		
		
	}

}
