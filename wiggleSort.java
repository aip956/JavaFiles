/*
 * https://leetcode.com/problems/wiggle-sort-ii/
 * 1. Copy into arrayLIst
 * 2. Sort
 * 3. Split array in half, left and right
 * 4. New array alternates between left and right
 */


public class wiggleSort {
    public void wiggleSort(int[] nums) {
        ArrayList<Integer> numsArr = new ArrayList<>();
        for (int num : nums) {
            numsArr.add(num);
        }
        System.out.println("16numsArr: " + numsArr);
        
    }


    public static void main(String[] args) {
        int[] nums1 = {1,5,1,1,6,4};
        // int[] nums2 = {1,3,2,2,3,1};
    }
}
