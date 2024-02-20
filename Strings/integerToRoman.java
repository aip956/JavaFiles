import java.util.HashMap;

public class integerToRoman {
    public static String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romNums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            for (int i = 0; i < romNums.length; i++) {
                if (num >= romNums[i]) {
                    result.append(roman[i]);
                    System.out.println("14result: " + result);
                    num -= romNums[i];
                    System.out.println("16num: " + num);
                    break;
                }
            }
        }
        return result.toString();    
    }

    public static void main(String[] args) {
        // int num1 = 3;
        int num2 = 58;
        int num3 = 1994;
        // System.out.println("Output1: " + intToRoman(num1));
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