import java.util.*;

class validAna {
    public static boolean isAnagram(String s, String t) {
        // if lengths are not equal, return false
        // create frequency hashes of s and t
        // iterate through s; are keys and vals equal in t?
        // iterate through t; are keys and vals equal in s?
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> freqMapS = new HashMap<>();
        // HashMap<Character, Integer> freqMapT = new HashMap<>();
        for (char letter : s.toCharArray()) {
            freqMapS.put(letter, freqMapS.getOrDefault(letter, 0) + 1);
        }
        System.out.println("13freqMapS: " + freqMapS);
        for (char letter : t.toCharArray()) {
            if (!freqMapS.containsKey(letter)) return false;

            int count = freqMapS.get(letter);
            if (count <= 0) return false;
            freqMapS.put(letter, count-1);
            System.out.println("22freqMapS: " + freqMapS);
        }
        return true;
    }


    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaran";
        System.out.println("Output1: " + isAnagram(s1, t1));
    }
}