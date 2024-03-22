import java.util.*;

public class firstUn2 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        char[] s_arr = s.toCharArray();
        for (Character c : s_arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("10: freqM: " + freqMap);

        // iterate through s_arr for freq of 1
        for (int i = 0; i < s_arr.length; i++) {
            if (freqMap.get(s_arr[i]) == 1) {
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
 *  * make a hashmap of char and freq
 * return first char of freq 1, or -1
 * Given a string s, find the first non-repeating character in it and 
 * return its index. If it does not exist, return -1.
 */