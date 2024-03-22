import java.util.*;

public class firstUniqChar {
    public static int firstUniqChar(String s) {
        HashMap <Character, Integer> freqList = new HashMap<>();
        char[] s_arr = s.toCharArray();
        for (Character c : s_arr) {
            freqList.put(c, freqList.getOrDefault(c, 0) + 1);
        }
        System.out.println("9freqL: " + freqList);
        for (int i = 0; i < s.length(); i++) {
            if (freqList.get(s_arr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Output1: " + firstUniqChar(s1));
        String s2 = "loveleetcode";
        System.out.println("Output2: " + firstUniqChar(s2));
        String s3 = "aabb";
        System.out.println("Output3: " + firstUniqChar(s3));
    }
}
/*
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * make an array list of char and freq
 * return first char of freq 1, or -1
 * Given a string s, find the first non-repeating character in it and 
 * return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 */