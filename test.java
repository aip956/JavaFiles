import java.util.*;

public class test {
    public static boolean isAnagram(String s, String t) {
        // Create a frequency hash
        // add string s to hash
        // for string t, subtract each letter
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (Character letter : s.toCharArray()) {
            freq.put(letter, freq.getOrDefault(letter, 0) + 1);
        }
        for (Character letter : t.toCharArray()) {
            if (!freq.containsKey(letter)) return false;
            int count = freq.get(letter);
            if (count <= 0) return false;
            freq.put(letter, count-1);
        }
        return true;
    }




    public static void main(String[] args) {
        String s1 = "rat";
        String t1 = "car";
        System.out.println("Output1: " + isAnagram(s1, t1));

    }
}