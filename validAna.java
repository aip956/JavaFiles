class Solution {
    public static boolean isAnagram(String s, String t) {
        // if lengths are not equal, return false
        // create frequency hashes of s and t
        // iterate through s; are keys and vals equal in t?
        // iterate through t; are keys and vals equal in s?
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> freqMapS = new HashMap<>();
        HashMap<Character, Integer> freqMapT = new HashMap<>();
        for (Char letter : s.toCharArray()) {

        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Output1: " + isAnagram(s1, s2));
    }
}