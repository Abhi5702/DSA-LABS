package com.arrayproblems;

import java.util.Arrays;

public class Findmax {
	
	public static int findmaxelement(int[]arr){
		
		int n = arr.length;
		int max=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}

	public static void main(String[]args) {
	
		int [] arr= {10,40,20,60,80};
		System.out.println(Arrays.toString(arr));
		
		int x = findmaxelement(arr);
		System.out.println(x);
}
}