package com.arrayproblems;

import java.util.Arrays;

public class MaxSumOFkConsecutiveArr {
	
	public static int maxSum(int[]arr,int k) {
		
		int n= arr.length;
		int result= Integer.MIN_VALUE;
		
		for(int i=0;i+k-1<n;i++) {
			int CurSum=0;
			for(int j=0;j<k;j++) {
				CurSum=CurSum+arr[i+j];
				
			}
			result = Math.max(result, CurSum);
		}
		return result;
	}
	
public static void main(String[]args) {
	int arr[]= {10,5,-2,20,1};
	int k=3;
	System.out.println(Arrays.toString(arr));
	
	int result =  maxSum(arr, k);
	System.out.println(result);
	
}
}
