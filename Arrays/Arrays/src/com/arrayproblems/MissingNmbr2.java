package com.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNmbr2 {
	
	public static int missingnumbers(int[]arr) {
		
		int n= arr.length;
		
		HashSet<Integer> myset = new HashSet<>();
		
		for(int x:arr) {
			myset.add(x);
		}
		for(int i=0;i<n;i++) {
			if(!myset.contains(i)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args) {
		int arr[] = {3,0,2,1,4,6};
		System.out.println(Arrays.toString(arr));
		
		int x = missingnumbers(arr);
		System.out.println(x);
	}
		

}
