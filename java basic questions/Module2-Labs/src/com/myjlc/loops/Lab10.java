package com.myjlc.loops; 



//11.Print the divisibles of given number 
public class Lab10 { 
 public static void main(String[] args) { 
 int n =10;
 
 for(int i=0;i<=n/2;i++) {
	 if(n%i == 0)
		 System.out.println(i);
		 
 
		 }
 System.out.println(n);
 }
}