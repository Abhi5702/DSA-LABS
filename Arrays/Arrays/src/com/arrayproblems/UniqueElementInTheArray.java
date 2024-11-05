package com.arrayproblems;

import java.util.Arrays;

public class UniqueElementInTheArray {
	
	public  static int  SingleNumber(int [] nums) {
		
	
		int result=0;
		
		for(int i=0;i<nums.length;i++) {
			result = result ^ nums[i];
		}
		return result;
		
		
	}

	public static void main(String[]args) {
		int[]arr= {10,20,30,30,20,10,70};
		System.out.println(Arrays.toString(arr));
		
		int x = SingleNumber(arr);
		System.out.println(x);
	}
}
