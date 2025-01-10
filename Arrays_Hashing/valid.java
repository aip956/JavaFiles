import java.util.HashMap;

class valid {
    public static boolean isAnagram(String s, String t) {
        // create hash of s
        // subtract each letter in t
        HashMap <Character, Integer> sFreq = new HashMap<>();
        // add s chars to sFreq
        for (Character c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
        }
        // minus t chars
        for (Character c : t.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(sFreq, 0) - 1);
        }
        
        return false;
    }

    public static void main(String[] args) {

    }

}

/*
frequency hash of s
subtract each char in t


 * Given two strings s and t, return true if t is an 
anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */