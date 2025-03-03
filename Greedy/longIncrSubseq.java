import java.util.*;
class longIncrSubseq {
    public static int LIS(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        // List<Integer> sub = new ArrayList<>();
        int[] len = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            // j pointer
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j])
                    if (len[j] + 1 > len[i])
                        len[i] = len[j] + 1;

            // find max value
            int maxIndex = 0;
            for (int i = 0; i < len.length; i++)
                if (len[i] > len[maxIndex])
                    maxIndex = i;
                return len[maxIndex] + 1;
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(LIS(nums));
    }
}



/*
At each element, decide to add it, or not; O(2^n)
Dynamic: make an array
Use memoization
[3,4,-1,0,6,2,3]
fill an array of 1's; min length
[1,1,1,1,1,1,1]
2 pointers j and i, if numi < numj, lip ++
1, 2, move i++, j stayes
[1,2,1,1,1,1,1]
then j moves to i; j=4 ? then start at beginning
then j=3, i=-1; -1 is less than 3  so -1 can't be in the sub
move j++ to 4, which is > -1, not valid
move J== to -1, which is = i=-1, start at beginning
so j = 3; i = 0; still < 3, so move j++
j=4, i=0; still j>i, so move j++ to -1
j=-1, i=0, so lis at 0 increases from lis at -1 (1)
[1,2,1,2,1,1,1]
j increases = i, so start over
j=3, i=6, j<i, so lis_i increases 1 from lis_j(1)
[1,2,1,2,2,1,1]
increment j++ to 4; 4 < 6, so increment lis(6)=lis(4)+1
[1,2,1,2,3,1,1]
increment j++ to -1, -1 < 6, so lis(6) increases vs. lisat -1 (1), but that's less than current lis(6)
[1,2,1,2,3,1,1] stays same
increm j to 0, 0 < 6, so lis(6) increases from lis(0) = 3; same
increm j to 6, start over
j=3, i=2, 3<2, incrm j
j=4, i=2, 4<2, incrm j
j=-1, i=2, so lis(2)=lis(-1)++; lis(2) = 2
[1,2,1,2,3,2,1]
j=0, i=2, 0<2 so lis(2)=lis(0)++ = 3
[1,2,1,2,3,3,1]
j=6, i=2, 6 !< 2, so j++, start over, increm i to 3
j=3, i=3; no change
j=4, i=3, 4!<3, no change
j=-1, i=3, add 1 to lis(-1); 1+1; lis(3) 2
[1,2,1,2,3,3,2]
j=0, i=3, 0<3, add 1 to lis(0); lis(3) now 3
[1,2,1,2,3,3,3]
j=6; i=3; no change
j=2, i=3; add 1 to lis(2); 3+1=4
[1,2,1,2,3,3,4]
find max; =4
 
use list sub to store smallest possible increasing subseq
    the list does not store the LIS, but helps determine its length
Iterate through the input array and process each element greedily
    if the current number is greater than the last element in sub, apppend it to sub (greedy choice)
    o/w, find the first element in sub that is >= current num and replace (using binary search)
    this keeps sub as small as possible ensuring efficient updates
the length of sub at end is length of lis
https://docs.google.com/document/d/1DI6uTzq4A-yUx9qzQaG-E4hG2s9puuTqlZnoN-zVANE/edit?tab=t.0

Longest Increasing Subsequence - Room 6
Given an array of integers, find the length of the longest increasing subsequence (LIS).
A subsequence is a sequence derived by deleting some elements (without reordering).
Example:
vector<int> nums = {10, 9, 2, 5, 3, 7, 101, 18};


Output: 
4 (The corresponding LIS is {2, 3, 7, 101}).

start with 2; smallest num and good starting point
consider 5; it forms an increasing subseq {2, 5}
consider 3; smaller than 5 but greater than 2, so replace 5 with 3 => {2, 3}
consier 7; greater than 3 so extend {2, 3, 7}
consider 101; greater than 7, so extend {2, 3, 7, 101}
consider 

 */