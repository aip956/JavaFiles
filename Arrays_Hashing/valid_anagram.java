import java.util.*;

class valid_anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // Make a freq map
        HashMap <Character, Integer> sFreq = new HashMap<>();
        for (char letter : s.toCharArray()) {
            sFreq.put(letter, sFreq.getOrDefault(letter, 0) + 1);
        }
        for (char letter : t.toCharArray()) {
            // if letter not in sFreq, return false
            if (!sFreq.containsKey(letter)) return false;
            int count = sFreq.get(letter);
            if (count <= 0) return false;
            sFreq.put(letter, count - 1);
        }
        return true;
    }

    public static void main(String[] args){
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}


/*
 * https://leetcode.com/problems/valid-anagram/description/
 * check if = length()
 * Make a freq map of s
 * check if letter in t is sFreq
 * int count = sFreq.get(letter); if count <= 0 retn false
 * subtract one from count: sFreq.put(letter, count - 1)
 * 
 */