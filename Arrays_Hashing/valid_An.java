import java.util.HashMap;

class valid_An {
    public boolean isAnagram(String s, String t) {
        // create hash of s
        // subtract each letter in t
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> s_freq = new HashMap<>();
        for (char letter : s.toCharArray()) {
            s_freq.put(letter, s_freq.getOrDefault(letter, 0)+1);
        }
        for (char letter : t.toCharArray()) {
            if (!s_freq.containsKey(letter)) return false;
            int count = s_freq.get(letter);
            if (count <= 0) return false;
            s_freq.put(letter, count-1);
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "abbb";
        String t = "babb";
        System.out.println("Result: " + validAnagram(s, t));
    }
}
