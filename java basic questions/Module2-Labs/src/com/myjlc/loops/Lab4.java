package com.myjlc.loops;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find max of three numbers
		
		int a=10;
		int b=20;
		int c=30;
		
		int max=(a>b) ? ( (a>c) ? a : c) : ((b>c) ? b : c); 
		System.out.println(max); 
		if(a>b && a> c) 
		max=a; 
		else if(b> a && b>c) 
		max = b; 
		else 
		max=c; 
		System.out.println("Max value is "+max); 

	}

}
