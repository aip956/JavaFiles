// https://leetcode.com/problems/container-with-most-water/
/* 1. Ceate a var to return final number
 * 2. Have 2 pointers at each end of the array
 * 3. maxArea = height * length
 * 4. Find smallest side aka height; min height of the two heights
 * 5. length = length of array - 1
 */

public class containerMostWater {
    public static int maxArea(int[] height) {
        System.out.println(height[0]);
        return height[0];
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maxheight: " + maxArea(height));

    }
}
