import java.util.*;

class ContDup {
    public static boolean containsDuplicate(int[] nums) {
        // add to a set; length of set = length of nums
        HashSet <Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return (numSet.size() != nums.length);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        boolean result = containsDuplicate(nums);
        System.out.println("Result: " + result);
    }

}