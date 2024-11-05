package com.stringsproblem;

public class CheckAnagram {
    
    static final int CHAR = 256; // Total number of characters in the ASCII table

    boolean areAnagram(String s1, String s2) {
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] count = new int[CHAR]; // Array to count character occurrences
        
        // Count characters in both strings
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;  // Increment count for characters in s1
            count[s2.charAt(i)]--;  // Decrement count for characters in s2
        }
        
        // Check if all counts are zero
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return false; // If any count is not zero, they are not anagrams
            }
        }
        
        return true; // All counts matched, so they are anagrams
    }
    
    public static void main(String[] args) {
        CheckAnagram anagramChecker = new CheckAnagram();
        
        String str1 = "silent";
        String str2 = "lieten";
        
        // Check if the strings are anagrams
        boolean result = anagramChecker.areAnagram(str1, str2);
        
        // Output the result
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}