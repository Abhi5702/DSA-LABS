package com.stringsproblem;
/* 
* @Author : Srinivas Dande 
* @Company: Java Learning Center 
* */

import java.util.HashMap;
import java.util.Map;

//Problem17 : Roman to Integer 
//LeetCode – 13 
 
public class romanToInt { 
  
 static Map<String, Integer> mymap = new HashMap<>(); 
 static { 
  mymap.put("M", 1000); 
  mymap.put("D", 500); 
  mymap.put("C", 100); 
  mymap.put("L", 50); 
  mymap.put("X", 10); 
  mymap.put("V", 5); 
  mymap.put("I", 1); 
 } 

 
 public static int romanToInt(String str) { 
 
  int n = str.length(); 
  int sum = 0; 
  int i = 0; 
 
  while (i < n) { 
   String currSymbol = String.valueOf(str.charAt(i)); 
   int currValue = mymap.get(currSymbol); 
 
   int nextValue = 0; 
   if (i + 1 < n) { 
    String nextSymbol = String.valueOf(str.charAt(i + 1)); 
    nextValue = mymap.get(nextSymbol); 
   } 
    
   if (currValue >= nextValue) { 
    sum = sum + currValue; 
    i = i + 1; 
   } else { 
    sum = sum + (nextValue - currValue); 
    i = i + 2; 
   } 
  } 
  return sum; 
 } 
 
 public static void main(String[] args) { 
 
  int result = romanToInt("MCMXCIV"); 
  System.out.println(result); 
 } 
} 
