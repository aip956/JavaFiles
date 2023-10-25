// https://leetcode.com/problems/container-with-most-water/
/* 1. Ceate a var to return final number
 * 2. Have 2 pointers at each end of the array
 * 3. maxArea = height * length
 * 4. Find smallest side aka height; min height of the two heights
 * 5. length = length of array - 1
 */

public class containerMostWater {
    public static int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        System.out.println("right: " + right);
        System.out.println("heightright: " + height[right]);
        while(left < right) {
            int areaHeight = Math.min(height[left], height[right]);
            int areaLen = right - left;
            int area = areaHeight * areaLen;
            System.out.println("area: " + area);
            maxArea = Math.max(maxArea, area);
            System.out.println("maxArea: " + maxArea);
            // move the pointer of the min of the heights
            if (height[left] <= height[right]) {
                left++;
            } else right--;
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maxheight: " + maxArea(height));

    }
}
