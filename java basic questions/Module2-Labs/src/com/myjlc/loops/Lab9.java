package com.myjlc.loops; 



//11. Find the Sum of Cubes of Numbers from 1 to N 
public class Lab9 { 
 public static void main(String[] args) { 
 int n = 5; 
 
 long sum=0; 
 for (int i = 1; i <= n; i++) { 
 sum = sum+i*i*i; 
 } 
 System.out.println("Sum : "+sum); 
 
 } 
} 