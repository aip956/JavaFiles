import java.util.HashMap;

class valid_An {
    public static boolean validAnagram(String s, String t) {
        
        
        }

        // subtract s from t
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
