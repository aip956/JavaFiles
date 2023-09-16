/* https://leetcode.com/problems/longest-consecutive-sequence/
// Does each element have an element to the left; ex: if 1, is 0 in array?
// Create a set; add elements, iterate through set
Create all sequences
100; is 101 in set? No
4; is 4 start of sequence; has left neighbor 3, not start
200; is 199 in set? No, so start of seq. 
    is 201 in set? No
1: start of seq? no left neighb so yes
    2 exist in set? Yes
    3 exist in set? Yes
    4 exist in set? Yes
    5 exist in set? No
3: start of seq? No
2: start of seq? No
so all sequ:
100, length 1
200, length 1
1, length 4
time: O(n), Mem O(n)
// does set contain element-1? 
if so, is it start of array?
*/


import java.util.*;
public class longestConsSeq {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int longest = 1;
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            numSet.add(num);
            System.out.println("33: " + numSet);
        }
        for (Integer num : numSet) {
            System.out.println("36 num: " + num);
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + 1)) {
                    length++;
                    System.out.println("41 length: " + length);
                    num++;
                    System.out.println("43 num: " + num);
                    longest = Math.max(length, longest);
                    System.out.println("45 longest: " + longest);
                }
            }  
        }
        return longest;
    }



    public static void main(String[] args) {
        int[] nums1 = {100,4,200,1,3,2};
        System.out.println("Output1: " + (longestConsecutive(nums1)));
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Output2: " + (longestConsecutive(nums2)));
    }

}
