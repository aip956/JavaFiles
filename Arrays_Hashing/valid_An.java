import java.util.HashMap;

class valid_An {
    public static boolean validAnagram(String s, String t) {
        // lengths equal
        if (s.length() != t.length()) return false;
        // add s to freq map
        HashMap <Character, Integer> sfreq = new HashMap<>();
        for (Character c : s.toCharArray()) {
            sfreq.put(c, sfreq.getOrDefault(c, 0) + 1);
        }
        // subt t from freq map
        for (Character c : t.toCharArray()) {
            if (!sfreq.containsKey(c)) return false;
            int count = sfreq.get(c);
            sfreq.put(c, count - 1);
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "abcd";
        String t = "abce";
        System.out.println("Result: " + validAnagram(s, t));
    }
}
