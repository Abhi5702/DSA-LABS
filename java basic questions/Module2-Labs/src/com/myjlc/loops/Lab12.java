package com.myjlc.loops; 



//11. Print Prime numbers from  1 to N
public class Lab12 {
	
	public static boolean isPrime(int n) { 
		 for (int i = 2; i <= n / 2; i++) { 
		 if (n % i == 0) { 
		 return false; 
		 } 
		 } 
		 return true; 
		 } 
		 public static void main(String[] args) { 
		 int n = 50; 
		for(int i=1;i<=n;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	 } 
}