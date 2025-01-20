import java.util.HashMap;

class valid_An {
    public static boolean validAnagram(String s, String t) {
        // lengths equal
        if (s.length() != t.length()) return false;
        // add s to freq map
        HashMap <Character, Integer> sfreq = new HashMap<>();
        
        // subt t from freq map
        return true;
    }



    public static void main(String[] args) {
        String s = "abcd";
        String t = "abce";
        System.out.println("Result: " + validAnagram(s, t));
    }
}
