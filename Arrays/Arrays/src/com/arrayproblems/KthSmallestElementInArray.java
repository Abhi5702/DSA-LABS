package com.arrayproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInArray {

	public static int kthSmallest (int[]arr,int k) {
		
		int n=arr.length;
		PriorityQueue<Integer> prqt = new        
                PriorityQueue<>(Comparator.reverseOrder());
		
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
			
			int result = kthSmallest(arr, k);
			System.out.println(result);
}
}