import java.util.*;
class minWinSub {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Freq map for t
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) +1);
        }

        // Slid win freq map
        Map<Character, Integer> winFreq = new HashMap<>();
        int left = 0; 
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0; // Start ind of min win
        int formed = 0; // Count of unique chars in win matching required freq

        // Num of unique chars in t that need to be matched
        int required = tFreq.size();

        // Expand the right bound of win
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            winFreq.put(rightChar, winFreq.getOrDefault(rightChar, 0) + 1);

            // Check if the curr char in the win matches the freq
            if (tFreq.containsKey(rightChar) && winFreq.get(rightChar).intValue() == tFreq.get(rightChar).intValue()) {
                formed ++;
            }

            // Contract the win from left
            while (left <= right && formed == required) {
                char leftChar = s.charAt(left);

                // Update the result if this win is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Decrease freq of the left char
                winFreq.put(leftChar, winFreq.get(leftChar) - 1);
                if (tFreq.containsKey(leftChar) && winFreq.get(leftChar) < tFreq.get(leftChar)) {
                    formed --;
                }
                left ++;
            }
            // Expand the right
            right ++;
        }
        // Return the min win or empty string if no win found
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}


/*
sliding win:
Use a map to store the frequency of each char in t
tFreq will help determin if a substring s contains all of t

2 Pointers:
left, right for win in s
expand right, add chars to winFreq map that tracks chars in a current win

Win is valid check:
valid if all chars in t are present with the rquired freq
maintain a formed counter that increments when a char in the win reaches the req'd freq in tFreq and decrements when it falls below

Minimize the win:
when valid win(formed = num of unique chars in t), shrink the win bymoving in left
keep track of the smallest win

Return result:
return substr using the recorded start position and length

Time complex: O(m+n)
Space complex: O(n+m)


https://leetcode.com/problems/minimum-window-substring/description/
Given two strings s and t of lengths m and n respectively, return the minimum window 
substring
 of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

 */