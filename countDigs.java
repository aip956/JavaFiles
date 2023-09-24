/*
https://leetcode.com/problems/count-the-digits-that-divide-a-number/submissions/
Given an integer num, return the number of digits in num that divide num.
An integer val divides nums if nums % val == 0.
Example 1:
Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:
Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:
Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 Constraints:
1 <= num <= 109
num does not contain 0 as one of its digits.
 */

public class countDigs {
    public static int countDigits(int num) {
        // num = 121; sum = 0; mod = 1; remDigs = 12
        int sum = 0;
        int modu = num % 10; 
        System.out.println("8modu: " + modu);
        int remDigs = num;
        while (remDigs > 0) {
            modu = remDigs % 10;
            System.out.println("modu: " + modu);
            System.out.println("12num % modu: " + num%modu);
            if (num % modu == 0) {
                    sum ++;
                    System.out.println("15sum: " + sum);
                }
                remDigs /= 10; // 1
                System.out.println("20remDigs: " + remDigs);
            }
            
        return sum;
        }

    public static void main(String[] args) {
        // int num1 = 7;
        // int result1 = countDigits(num1);
        // System.out.println("Result1: " + result1);

        // int num2 = 121;
        // int result2 = countDigits(num2);
        // System.out.println("Result2: " + result2);

        int num3 = 54;
        int result3 = countDigits(num3);
        System.out.println("Result3: " + result3);

    }
}
