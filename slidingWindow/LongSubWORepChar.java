import java.util.*;
class LongSubWORepChar {
    public static int lengthOfLongestSubstring(String s) {
        
        
    }


    public static void main(String[] args) {
        s = "abcabcbb"; // 3
        System.out.println(lengthOfLongestSubstring(s));
    }
}

/*
Sliding window
- 2 pointers, left and right, to represent the current window
- Expand the right pointer to include new chars
- If a duplicate is found, move the left pointer to the right of the last 
occurrence of the dup char to remove it from the window
Use a HashMap to Track Chars
- Use a hash to store the most recent index of each char
- If a char is already in the map (indicating a dup in the window),
move the left pointer to map.get(char) + 1 to skip over the prev occurrence
Updated the Max Length
- After each addition of a char to the window, calc the length of the 
current substring as right-left+1


 * Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */