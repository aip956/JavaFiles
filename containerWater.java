import java.util.*;

class containerWater {
    public static int maxArea(int[] height) {
        int maxVol = 0; // keep track of the max Volume
        int left = 0; // left pointer
        int right = height.length - 1; // right pointer
        while (right > left) {
            // tallness of container is min of 2 walls
            int tall = Math.min(height[left], height[right]);
            int width = right - left;
            // volume
            int vol = tall * width;
            maxVol = Math.max(vol, maxVol);
            // move in the pointer of the shorter side
            if (height[left] < height[right]) {
                left++;
            } else right--;
        }

        return maxVol;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

/*
 * Create a var to return final number
 * 2 pointers at each end of array
 * maxArea = height * length
 * find smaller side/height; min of 2 heights
 * length = length of array - 1
 */