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
        HashMap<String, Integer> roman = new HashMap<>();


    }

    public static void main(String[] args) {
        String s1 = "III";
        System.out.println("Output1: " + romanToInt(s1));
        String s2 = "LVIII";
        System.out.println("Output2: " + romanToInt(s2));
        String s3 = "MCMXCIV";
        System.out.println("Output3: " + romanToInt(s3));
    }
}
/*
 * https://leetcode.com/problems/roman-to-integer/description/
 * 
 */