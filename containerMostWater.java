// https://leetcode.com/problems/container-with-most-water/
/* 1. Ceate a var to return final number
 * 2. Have 2 pointers at each end of the array
 * 3. maxArea = height * length
 * 4. Find smallest side aka height; min height of the two heights
 * 5. length = length of array - 1
 */

 /*
  * left = 0, right = length - 1 index
  height = Math.min(height[left], height[right]) 
  length = right - left
  vol = height * length
  maxVol = Math.max(vol, maxVol)
  while right > left, 
    find tall; lower of left and right heights
    find length
    find vol
    determine maxVol; max of maxVol and vol
    if left height is < right height, increase left
    else decrease right
  
  */
public class containerMostWater {
    public static int maxArea(int[] height) {
        int maxVol = 0;
        int left = 0;
        int right = height.length - 1;
        while (right > left) {
            System.out.println("25right: " + right);
            System.out.println("26left: " + left);
            int tall = Math.min(height[left], height[right]);
            System.out.println("27tall: " + tall);
            int width = right - left;
            System.out.println("30width: " + width);
            int vol = tall * width;
            System.out.println("32vol: " + vol);
            maxVol = Math.max(vol, maxVol);
            System.out.println("34maxVol: " + maxVol);
            if (height[left] < height[right]) {
                left++;
            } else right--;
        }
      return maxVol;  
        // int maxArea = 0;
        // int left = 0;
        // int right = height.length - 1;
        // System.out.println("right: " + right);
        // System.out.println("heightright: " + height[right]);
        // while(left < right) {
        //     int areaHeight = Math.min(height[left], height[right]);
        //     int areaLen = right - left;
        //     int area = areaHeight * areaLen;
        //     System.out.println("area: " + area);
        //     maxArea = Math.max(maxArea, area);
        //     System.out.println("maxArea: " + maxArea);
        //     // move the pointer of the min of the heights
        //     if (height[left] <= height[right]) {
        //         left++;
        //     } else right--;
        // }
        // return maxArea;
    }


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maxheight: " + maxArea(height));

    }
}

/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
 */