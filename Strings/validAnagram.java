// https://leetcode.com/problems/valid-anagram/
import java.util.*;
package Strings;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charFreq = new HashMap<>();
        for (Character letter : s) {
            charFreq.put(letter, charFreq.getOrDefault(charFreq, null))
        }

        
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Output: " + isAnagram(s, t);
    }
    
}

/*
 * Determine that s.length() == t.length()
 * Create a hash table for s, and one for t
 * Determine if they are equal
 * decrease each occurence from t in s
 */
