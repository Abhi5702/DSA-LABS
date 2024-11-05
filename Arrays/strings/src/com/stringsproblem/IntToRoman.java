package com.stringsproblem;

public class IntToRoman {
	
	static final int myvalues[]= {1000,900,500,400,100,50,40,10,9,5,4,1};
	static final String mysymbols[]= {"M","CM","D","CD","C","XC","L","XL","X","X","IX","V","IV","I"};
	
	
	public static String intToRoman(int num) {
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i=0;i<myvalues.length;i++) {
			while(num>=myvalues[i]) {
				num=num-myvalues[i];
				sb.append(mysymbols[i]);
			}
		}
		return sb.toString();
	}
	
	public static void main(String []args) {
		String result = intToRoman(2535);
		System.out.println(result);
	}
}