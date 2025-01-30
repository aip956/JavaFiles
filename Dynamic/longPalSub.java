class longPalSub {
    public static String longestPalindrome(String string) {
        // iterate through string and track pal length
        // check odd and even len pal

        int len = string.length();
        int l = len/2;
        int r = len/2;
        for (Character s : string.toCharArray()) {
            // Odd, left and right pointer; init at center
            
            while (l >= 0 && r < len && s[l] == s[r]) {

            }
        }

    }


    public static void main(String[] args) {
        String s1 = "babad";
        System.out.println(longestPalindrome(s1));
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