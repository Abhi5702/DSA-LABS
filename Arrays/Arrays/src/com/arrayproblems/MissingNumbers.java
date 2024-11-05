package com.arrayproblems;

import java.util.Arrays;

public class MissingNumbers {

	public static int MissingNumbers(int[] arr) {

		int n = arr.length;
		int actualsum = 0;

		for (int x : arr) {
			actualsum = actualsum + x;
		}
		int expSum = n * (n + 1) / 2;

		return expSum - actualsum;
	}

	public static void main(String[] args) {
		int[] arr = {0, 1,3,4 };
		System.out.println(Arrays.toString(arr));

		int x = MissingNumbers(arr);
		System.out.println(x);

	}
}
