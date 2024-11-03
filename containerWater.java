
class containerWater {
    public static int maxArea(int[] height) {
        
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