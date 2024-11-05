package com.arrayproblems;

public class FrequencyInArray {
	
	static void printfreq(int []arr,int n) {
		
		int freq=0,i=1;
		 
		while(i<n) {
			while(i<n && arr[i] == arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+ " "+freq);
		}
		i++;
		freq=1;
		
	
	if(n==1 || arr[n-1]!=arr[n-2])
	System.out.println(arr[n-1]+ " "+1);
	}
	public static void main(String[]args) {
		
		int [] arr = {10,10,20,20,30,30,30},n= 6;
		printfreq(arr,n);
	}
}