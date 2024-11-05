package com.myjlc.loops; 



//11. Count the divisibles of given numbers
public class Lab13 {
     public static void main(String[]args) {
    	 int n=10;
    	 
    	 int count=2;
    	 
    	 for(int i=1;i<=n/2;i++) {
    		 if(i%n==0)
    			 count++;
    	 }
    	 System.out.println("Count:"+count);
     }
	
}