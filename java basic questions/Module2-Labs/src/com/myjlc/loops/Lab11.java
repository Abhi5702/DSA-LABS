package com.myjlc.loops; 



//11. Check whether the number is prime or not
public class Lab11 {
	
	public static boolean isPrime(int n) { 
		 for (int i = 2; i <= n / 2; i++) { 
		 if (n % i == 0) { 
		 return false; 
		 } 
		 } 
		 return true; 
		 } 
		 public static void main(String[] args) { 
		 int n = 10; 
		 boolean flag = isPrime(n); 
		 System.out.println(flag); 
		 } 
		}