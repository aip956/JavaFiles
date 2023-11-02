import java.util.*;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        // iterate through nums
        // for each element, is the compliment in a hash
        // if not put it index, compliment
        // round 1: ind = 0, num[i] = 2, compl = 7; add to hash: {2, 0} or num[i],i
        // round 2: ind = 1, num[i] = 7, compl = 2; add to hash: {2, 0}

        Map<Integer, Integer> compHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            System.out.println("Compl: " + compliment);
            if (compHash.containsKey(compliment)) {
                return new int[] {compHash.get(compliment), i};
            } else {
                compHash.put(nums[i], i);
            }
            System.out.println("Hash: " + compHash);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.print("Output1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
