import java.util.*;

public class test {
    public static int[] twoSum(int[] nums, int target) {
//         // create a hashmap to store the compliment and index
//         // for 2, look for 9 - 2 = 7, if not in hashmap, add key, value as 2, 0
//         // for 7, look for 9 - 7 = 2, if in hashmap, return index of 2 and 7
        Map<Integer, Integer> compHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (compHash.containsKey(comp)) {
                return new int[] {compHash.get(comp), i};
            }
            compHash.put(nums[i], i);
            System.out.println("compHash: " + compHash);
        }
        return new int[] {};
    }




    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9; // should return [0,1]
        int[] result1 = twoSum(nums1, target1);
        System.out.print("Output1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");  
        
        
        // Output: 87655
    }
}