import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UncommonChars {
    public static String findNonCommonChars(String a, String b) {
        // Make char sets for a and b
        // Make treeSet for uncommon
        // Is each char in setA not in setB, add to tree
        // convert to string
        if (a.equals(b)) {
            return "-1";
        }
        HashSet<Character> setA = new HashSet<>(a.length());
        HashSet<Character> setB = new HashSet<>(b.length());

 
        for (char ch : a.toCharArray()) {
            setA.add(ch);
        }
        System.out.println("setA: " + setA);
        for (char ch : b.toCharArray()) {
            setB.add(ch);
        }
        System.out.println("setB: " + setB);

        TreeSet <Character> uncommon = new TreeSet<>();
        for (char ch : setA) {
            if (!setB.contains(ch)) {
                uncommon.add(ch);
            }
        }
         for (char ch : setB) {
            if (!setA.contains(ch)) {
                uncommon.add(ch);
            }
        }
        System.out.println("uncommon: " + uncommon);

        // convert to string
        StringBuilder output = new StringBuilder();
        for (char ch : uncommon) {
            output.append(ch);
        } 
        
        if (output.length() == 0) {
            return "-1";
        }

        return output.toString();
    }
    
    public static void main(String[] args) {
        // String a = "geeksforgeeks";
        // String b = "geeksquiz";
        String a = "aaaabbbb";
        String b = "ab";
        String output = findNonCommonChars(a, b);
        System.out.println("Output: " + output); // Output: "fioqruz"
    }

}


