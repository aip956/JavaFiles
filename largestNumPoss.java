/* https://practice.geeksforgeeks.org/problems/largest-number-possible5028/1
Given two numbers "N" and "S", find the largest number that can be formed
with N digits that sum to "S". Return -1 if not possible
 Ex: N = 2; S = 9 => 90
30; 9; 9; 9; 
Ex: N = 2; S = 4 => 40
1. Check if possible to form a number with N digits that sum to S; 
2. Array of N digits to store result
3. Start with leftmost digit and move right
4. For each digit, find the largest digit that can be placed while sum of 
remaining to right is <= S
5. Start with 9 and decrement until the sum of remaining digs to right is 
<= S
6. Update the S by subtracting the chosen digit
7. Repeat 4 - 6 for each position to N digits
8. If I fill all N digs and S becomes 0; return resulting number; convert to string
*/

import java.util.*;
public class largestNumPoss {
    static String findLargest(int N, int S){

        if (N * 9 < S) return "-1"; // need if statement if can't be done
        // 9 + 10*9
        StringBuilder output = new StringBuilder();
        int[] digits = new int[N];
        for (int i = 0; i < N; i++) {
            for (int digit = 9; digit >= 0; digit--) {
                if (i == 0 && digit == 0 && S != 0) {
                    continue;
                }
                if (S >= digit) {
                    digits[i] = digit;
                    S -= digit;
                    break;
                }
            }
        }
        for (int digit : digits) {
            output.append(digit);
        }
        return output.toString;
    }


    public static void main (String[] args) {
        int n1 = 2;
        int s1 = 9;
        System.out.println("Output1: " + findLargest(n1, s1));
    }

}
