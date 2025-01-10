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
        // minus t chars, check if sFreq contains c, no -> false
        // count = c's freq
        // put(letter, count-1)
        for (Character c : t.toCharArray()) {
            if (!sFreq.containsKey(c)) return false;
            int count = sFreq.get(c);
            sFreq.put(c, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        System.out.println(isAnagram(s, t));

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