import java.util.*;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        // iterate through nums
        // for each element, is the compliment in a hash
        // if not put it index, compliment
        HashMap<Integer, Integer> compHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (compHash.containsKey(compliment)) {
                return new int[] {compHash.get(compliment), i};
            } else {
                compHash.put(i, compliment);
            }
            System.out.println("Hash: " + compHash);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(twoSum(nums1, target1));
    }
}
