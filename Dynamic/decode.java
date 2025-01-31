
class decode {
    public static int numDecodings(String s) {
        // 122016; 0th can only dec 1, at i = 4, not val, but 20 val
        // arr: 1 if > 0, [1, 1, 1+1, 2+1, 2, 2+, 2+2]
        // i=3, for2, 2 is valid, 1, 12 is val, 1
        // is num valid; is num and prev valid?
         int n = s.length();
         if (n == 0) return 0;
         int[] dp = new int[n + 1];
         dp[0] = 1;
         dp[1] = s.charAt(0) == '0' ? 0 : 1;
        // [1, 1, ]
        for (int i = 2; i <= n; i++) {
            int oneDig = Integer.valueOf(s.substring(i-1, i));
            int twoDig = Integer.valueOf(s.substring(i-2, i));

            if (oneDig >= 1) dp[i] += dp[i-1];
            if (twoDig >= 10 && twoDig <= 26) dp[i] += dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s1 = "12";
        System.out.println(numDecodings(s1));
        System.out.println();
        String s2 = "226";
        System.out.println(numDecodings(s2));
        System.out.println();
        String s3 = "06";
        System.out.println(numDecodings(s3));
    }
}
/*
 https://leetcode.com/problems/decode-ways/
 You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:

"1" -> 'A'

"2" -> 'B'

...

"25" -> 'Y'

"26" -> 'Z'

However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25").

For example, "11106" can be decoded into:

"AAJF" with the grouping (1, 1, 10, 6)
"KJF" with the grouping (11, 10, 6)
The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
Note: there may be strings that are impossible to decode.

Given a string s containing only digits, return the number of ways to decode it. If the entire string cannot be decoded in any valid way, return 0.

The test cases are generated so that the answer fits in a 32-bit integer.

 

Example 1:
Input: s = "12"
Output: 2
Explanation:
"12" could be decoded as "AB" (1 2) or "L" (12).

Example 2:
Input: s = "226"
Output: 3
Explanation:
"226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

Example 3:
Input: s = "06"
Output: 0
Explanation:
"06" cannot be mapped to "F" because of the leading zero 
("6" is different from "06"). In this case, the string is 
not a valid encoding, so return 0.


60: 1?
606? 1?

1 2 2 0 1 6
if last 2 digs are valid, then it's value up to 2 before plus last 2 digs
ways[i] = ways[i-1] (if new single dig is valid) +
    ways[i-2] (if last 2 digs val)

 */