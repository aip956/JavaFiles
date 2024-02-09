import java.util.*;
public class buddyStrings {
    public static boolean buddyStrings(String s, String goal) {
        // 1. test they are the same length
        // 2. if A==B, if there are repeated chars, return true
        // 3. else count number of differences; if there are only 2 AND the strings are equal after swap, return tru
        // 1.
        if (s.length() != goal.length()) return false;

        // 2.
        if (s.equals(goal)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.lastIndexOf(s.charAt(i)) != i) {
                    return true;
                }
            }
            return false;
        }
        
        // 3. 
        int diffCount = 0;
        int[] diffIndicies = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (diffCount == 2) return false;
                diffIndicies[diffCount] = i;
                diffCount++;
                System.out.println("27i: " + i);
            }
        }
        if (diffCount != 2) return false;
        return (s.charAt(diffIndicies[0]) == goal.charAt(diffIndicies[1]) 
        && s.charAt(diffIndicies[1]) == goal.charAt(diffIndicies[0]));
        
    }

    public static void main(String[] args) {
        String s = "aaaaaaabc";
        String goal = "aaaaaaacb";
        System.out.println("Output: " + buddyStrings(s, goal));
    }

}


/*
solution passes
space: O(1); created diffIndices array fixed at 2 and does not depend on 
s and goal
time: O(n);worst case will iterate through s and goal twice:
    1. checking for repeated chars in s
    2. once comparing characters betweeen s and goal
    Depends on length of s/goal

 * https://leetcode.com/problems/buddy-strings/
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
Example 2:

Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
Example 3:

Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 

Constraints:

1 <= s.length, goal.length <= 2 * 104
s and goal consist of lowercase letters.
 */