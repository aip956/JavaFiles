import java.util.*;
class LongRepCharRepl {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxLength = 0;
        int maxCount = 0; // max freq of a single char in the window
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Update freq map for the current char
            count[s.charAt(right) - 'A']++;
            // Update the max freq char count in win
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // Calc curr wind size:
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--; // remove leftmost char in win
                left++; // shrink win
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        Int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}

/*
Sliding Win:
2 pointers, left and right
Expand the right to include current char

Freq Map:
- Use an array count of size 26 (for each uppercase letter) to keep track of th
freq of each char in the current window
- Track the freq of the most common char, maxCount

Check/adjust window size
- Length of window = right - left + 1
- If num of chars that need to be replaced (win length - maxCount) > k, win too large
    Shrink win by moving left pointer to right
- Return max win length

 You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.

 */