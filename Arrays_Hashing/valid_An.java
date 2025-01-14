import java.util.HashMap;

class valid_An {
    public static boolean validAnagram(String s, String t) {
        // create hash
        HashMap<Character, Integer> sFreq = new HashMap<>();
        for (Character c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(c, 0)+ 1);
        }
        // subtract t from hash
        for (Character c : t.toCharArray()) {
            
            if (!sFreq.containsKey(c)) return false;
            int count = sFreq.get(c);
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