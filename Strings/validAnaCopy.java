import java.util.HashMap;

public class validAnaCopy {
    public static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       HashMap<Character, Integer> sfreq = new HashMap<>();
       for (Character letter : s.toCharArray()) {
            sfreq.put(letter, sfreq.getOrDefault(letter, 0)+1);

       }
       for (Character letter : t.toCharArray()) {
        if (!sfreq.containsKey(letter)) return false;
        int count = sfreq.get(letter);
        if (count <= 0) return false;
        sfreq.put(letter, count -1);
       }
       return true;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Output1: " + isAnagram(s1, t1));
    }


}
/*
Time: O(n); n is length of strings s and t
Space:
if not equal length, return false

create hash of letter, frequency, for string s
if shash does not have letter in t return false
if count <= 0 return false
for string t, remove elements from hash

return if hash is empty
 * https://leetcode.com/problems/valid-anagram/
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */