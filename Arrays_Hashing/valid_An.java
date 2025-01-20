import java.util.HashMap;

class valid_An {
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // make s freq map
        HashMap <Character, Integer> sFreq = new HashMap<>();
        for (Character c : s.toCharArray()) {
            sFreq.put(c, )
        }

        // subtract s from t

        
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abce";
        System.out.println("Result: " + validAnagram(s, t));
    }
}
