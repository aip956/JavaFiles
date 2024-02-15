import java.util.*;

public class romanToInt {
    public static int romanToInt(String s) {
        /* 
        convert to charArray
        create hash of roman:value
        create int total, prev
        iterate through string
        for letter in string, add value from has to total
        if value > prev value, total -= 2*prev
        */
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);   
        roman.put('X', 10); 
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int value = roman.get(letter);
            total += value;
            System.out.println("29total: " + total);
            if (value > prev) {
                total -= 2 * prev;
                System.out.println("32total: " + total);
            }
            prev = value;
        }
        return total;
    }
    public static void main(String[] args) {
        // String s1 = "III";
        // System.out.println("Output1: " + romanToInt(s1));
        // String s2 = "LVIII";
        // System.out.println("Output2: " + romanToInt(s2));
        // String s3 = "MCMXCIV";
        // System.out.println("Output3: " + romanToInt(s3));
        String s4 = "IV";
        System.out.println("Output4: " + romanToInt(s4));
    }
}
/*
 * https://leetcode.com/problems/roman-to-integer/description/
 * 
 */