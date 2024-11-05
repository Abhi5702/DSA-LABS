package com.arrayproblems;

import java.util.Arrays;

public class MaxSubArraySum {
	
	public static int MaxSubArraySum (int[]arr) {
		
		int maxSum=Integer.MIN_VALUE;
		int curSum=0;
		
		for(int i=0; i<arr.length; i++) {
			curSum = curSum+arr[i];
		}
		
		if(curSum>maxSum) {
			maxSum=curSum;
		}
		if(curSum<0) {
			curSum=0;
		}
		
		return maxSum;
	}
	
	public static void main(String[]args) {
		
		int[] arr= {10,32,-1,6,-10,20};
		System.out.println(Arrays.toString(arr));
		
		int result = MaxSubArraySum(arr);
		System.out.println(result);
	}

}
