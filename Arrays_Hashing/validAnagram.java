import java.util.HashMap;

class validAnagram {
    public static boolean validAnagram(String s, String t) {
        // make freq map of s
        // for each char in t, check if in s
        // create count, subtract 
        HashMap<Character, Integer> sFreq = new HashMap<>();
        for (Character c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(c, 0) +1);
        }
        System.out.println("sFreq: " + sFreq);

        
        for (Character c : t.toCharArray()) {
            if (!sFreq.containsKey(c)) return false;
            // get the freq of c in the hash
            int count = sFreq.get(c);
            // subtract c from the hash
            sFreq.put(c, count - 1);
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "abc";
        String t = "abd";
        System.out.println(validAnagram(s, t));

    }
}
