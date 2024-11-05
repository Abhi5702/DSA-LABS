package com.arrayproblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static int kthlargest (int[]arr,int k) {
		
		int n=arr.length;
		PriorityQueue<Integer> prqt = new PriorityQueue<>();
		
		for(int x:arr) {
			prqt.add(x);
		
		if(prqt.size()>k) {
			prqt.poll();		
			
		}
		 
	}
		return prqt.peek();
	}
		
		public static void main(String[]args) {
			
			int arr[]= {10,32,43,56,34,67};
			int k=3;
			System.out.println(Arrays.toString(arr));
			
			int result = kthlargest(arr, k);
			System.out.println(result);
}
}