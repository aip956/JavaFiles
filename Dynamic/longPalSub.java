import java.util.*;

class longPalSub {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left >= end - start) { // Check if longest pal
                    start = left;
                    end = right;
                }
                left --;
                right ++;
            }
            // Even-length pali
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left >= end - start) {
                    start = left;
                    end = right;
                }
                left --;
                right ++;
            }
        }
        return s.substring(start, end + 1);
    }


    public static void main(String[] args) {
        String s1 = "abcdefedc";
        System.out.println(longestPalindrome(s1));
        System.out.println();
        String s2 = "abrbadaadab";
        System.out.println(longestPalindrome(s2));

    }
}

/*
Longest Palindromic Substring
https://leetcode.com/problems/longest-palindromic-substring/description/
Given a string s, return the longest palindromic substring in s.

s in string babad
prev2=b
prev1=a
longest= s[n]= add to array, if i hit a letter in the array, it has to reverse
ba, b = bab
baba not pal, so still bab
babad, not pal, so still bab
need to calc length of palin

abcdefedc => cdefedc

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

 */