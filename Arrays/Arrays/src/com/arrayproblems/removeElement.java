package com.arrayproblems;

import java.util.Arrays;

public class removeElement {
	
	public static int RemoveElement(int arr[],int element) {
		
		int n= arr.length;
		int k=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=element) {
				arr[k]=arr[i];
				k++;
			}
		}
		for(int i=k;i<n;i++) {
			arr[i]=0;
		}
		return k;
	}
	public static void main(String[]args) {
		int arr[]= {20,30,40,30,50,10,30};
		int element = 30;
		
		System.out.println(Arrays.toString(arr));
		
		int count = RemoveElement(arr, element);
		System.out.println("unique Count:"+count );
		System.out.println(Arrays.toString(arr));
		

}
}
