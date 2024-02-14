public class longestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // iterate through the strings length - 1
        // for each char in string, if in all elements, add char to string
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) { // iterate in a word
            char currLetter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { // iterate through the array words
                // if i is >= word or not= letter, stop and return
                if (i >= strs[j].length() || strs[j].charAt(i) != currLetter){
                    return output.toString();
                }
            }
            output.append(currLetter);
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        System.out.println("Output1: " + longestCommonPrefix(strs1)); // "fl"
        System.out.println("Output2: " + longestCommonPrefix(strs2)); // ""
    }
}

/*
Solution passes
Space: O(m)
    Stringbuilter for output, length of common prefix can be equal
    to the shortest string(m). Also use constant amount of space for currLetter,
    i, j
Time: O(n*m) 
    Outer loop iterates throughe ach char position in the first string, length m
    Inner loop iterates through each of the other n-1 strings in array. 
    Worst case, iterates through entire length of each string, m (O(n-1)*m)
    Combined: O(m+(n-1)*m) = O(n*m)
 * https://leetcode.com/problems/longest-common-prefix/description/
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */