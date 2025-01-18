import java.util.HashMap;

class valid_An {
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // make s freq map
        HashMap <Character, Integer> sFreq = new HashMap<>();
        for (Character c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(sFreq, 0) + 1);
        }

        // subtract each char c; define count
        // is c in sfreq? yes: add c, count-1 to sfreq
        for (Character c : t.toCharArray()) {
            int count = 0;
            if (!sFreq.containsKey(c)) return false;
            sFreq.put(c, count - 1);
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abce";
        System.out.println("Result: " + validAnagram(s, t));
    }
}
