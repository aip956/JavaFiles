// https://leetcode.com/problems/valid-anagram/
import java.util.*;


public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) return false;
        // Map<Character, Integer> charFreq = new HashMap<>();
        // // create map for s
        // for (Character letter : s.toCharArray()) {
        //     charFreq.put(letter, charFreq.getOrDefault(letter, 0) + 1);
        // }
        // // decrement for t
        // System.out.println("14 charFreq: " + charFreq);
        // for (Character letter : t.toCharArray()) {
        //     if (!charFreq.containsKey(letter)) {
        //         return false;
        //     }
        //     int count = charFreq.get(letter);
        //     if (count <= 0) {
        //         return false; // if a char count goes negative, return false
        //     }
        //     charFreq.put(letter, count-1);

        // }
        // return true;

        // if lengths are not equal, return false
        // frequency map of s
        // iterate through t, 
        // if letter in t is not in freqMap, return false
        // if count of freq is <= 0, return false
        // delete frequency for each letter
        if (s.length() != t.length()) {
            return false;
        }
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // a:1, n:1, g:1, r:1, m:1
        Map<Character, Integer> freqMapS = new HashMap<>();
        for (Character letter : s.toCharArray()) {
            freqMapS.put(letter, freqMapS.getOrDefault(letter, 0) +1);
        }
        // Map<Character, Integer> freqMapS = new HashMap<>();
        // for (Character letter : s.toCharArray()) {
        //     freqMapS.put(letter, freqMapS.getOrDefault(letter, 0) +1);

        // }
        // iterate through t
        for (Character letter : t.toCharArray()) {
            if (!freqMapS.contansKey(letter)) {
                return false;
            }

        // for (Character letter : t.toCharArray()) {
        //     if (!freqMapS.containsKey(letter)) {
        //         return false;
        //     }
            int count = freqMapS.get(letter); // get the value of the key
            // int count = freqMapS.get(letter);
            if (count <= 0) { // if the count is already 0, then there's an extra letter in t
                return false;
            }
            // if (count <= 0) {
            //     return false;
            // }
            freqMapS.put(letter, count-1); // reduce the value/count by 1
            // freqMapS.put(letter, count-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Output: " + isAnagram(s, t));
    }
    
}

/*
 * Determine that s.length() == t.length()
 * Create a var to store str chars frequ
 * loop throug str1 and fill in obj with key being char and value being freq
 * loop throug hstr2 and if char is not in the Obj, return alse
 * if char is in obj, decease value by one
 * if extra char or not enough, return false
 * 
 * Time complexity: O(2n) => O(n); looping though each character
 * Space complexity: O(c) where c is at most 26 chars
 * 
 * Create a hash table for s, and one for t
 * Determine if they are equal
 * decrease each occurence from t in s
 */
