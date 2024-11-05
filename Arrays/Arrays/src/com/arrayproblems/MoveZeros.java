package com.arrayproblems;

import java.util.Arrays;

public class MoveZeros {
	
	public static void moveZerostoEnd(int []arr) {
		
		int n= arr.length;
		int k=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int x=arr[i];
				arr[i]=arr[k];
				arr[k]=x;
				k++;
				
			}
		}
	}
	public static void main(String []args) {
		int [] arr={0,20,12,34,0,0,12};
		System.out.println(Arrays.toString(arr));
		
		moveZerostoEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

}
