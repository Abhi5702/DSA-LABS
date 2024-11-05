package com.arrayproblems;

import java.util.Arrays;

public class rotateleftone {

	public static void rotateleftbyone(int[] arr) {

		int n = arr.length;
		int x = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n-1]=x;

	}
	public static void main(String[]args) {
		int arr[]={1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		rotateleftbyone(arr);
		System.out.println(Arrays.toString(arr));
		
		rotateleftbyone(arr);
		System.out.println(Arrays.toString(arr));

}
}
