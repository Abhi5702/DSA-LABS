package com.arrayproblems;

import java.util.Arrays;

public class removeDuplicateFromSortedArray {

	static int RemoveDuplicate(int[] arr) {
		int n = arr.length;
		int k = 1;

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[k - 1]) {
				arr[k] = arr[i];
				k++;
			}
		}
		for (int i = k; i < n; i++) {
			arr[i] = 0;
		}
		return k;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 40, 40, 50, 60, 60 };
		System.out.println(Arrays.toString(arr));

		int count = RemoveDuplicate(arr);
		System.out.println("Unique: "+count);
		
		System.out.println(Arrays.toString(arr));

	}
}
