package com.arrayproblems;

import java.util.Arrays;

public class ReverseArray {
	
	public static void reverse(int []arr) {
		
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
	}
	
	public static void main(String[]args) {
		
		int []arr= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
			
		}
		System.out.println("");
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
