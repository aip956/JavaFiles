import java.util.HashMap;

public class integerToRoman {
    public static String intToRoman(int num) {
        HashMap<String, Integer> roMap = new HashMap<>();
        roMap.put("M", 1000);
        roMap.put("CM", 900);
        roMap.put( "D", 500);
        roMap.put("CD", 400);
        roMap.put("C", 100);
        roMap.put("XC", 90);
        roMap.put("L", 50);
        roMap.put("XL", 40);
        roMap.put("X", 10);
        roMap.put("IX", 9);
        roMap.put("V", 5);
        roMap.put("IV", 4);
        roMap.put("I", 1);
        // create list of sorted romans
        List<String> sortedRomans = new 
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            for (String roman : roMap.keySet()) {
                // System.out.println("8roman: " + roman);
                // System.out.println("9roMap.values(): " + roMap.values());

                if (num >= roMap.get(roman)) {
                    result.append(roman);
                    System.out.println("10result: " + result);
                    num -= roMap.get(roman);
                    System.out.println("15num: " + num);
                    break;
                }
            }
        }
        return result.toString();    
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 58;
        int num3 = 1994;
        System.out.println("Output1: " + intToRoman(num1));
        System.out.println("Output2: " + intToRoman(num2));
        System.out.println("Output3: " + intToRoman(num3));
    }
}

/*
/*
        if input num > highest roman, add it to the string builder and 
        reduce corresponding val from input
        if input < highest roman, then check with next highest roman
        Hash:
        M, 1000
        CM, 900
        D, 500
        CD, 400
        C, 100
        XC, 90
        L, 50
        XL, 40
        X, 10
        IX, 9
        V, 5
        IV, 4
        I, 1

        for 58: check 1000, 500, 100, 
        58 > 50, so add L, sub 50 from 58, num = 8, string = L
        8 > 5, so add V, num - 5 = 3, string = LV
        3 > 1, add I, num - 1 = 2, string = LVI
        2 > 1, add I, num - 1 = 1, string = LVII
        1 >= 1, add I, num - 1 = 0, string = LVIII

 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= num <= 3999
 */