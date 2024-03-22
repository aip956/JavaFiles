import java.util.*;

public class distrCandy {
    public static int distributeCandies(int[] candyType) {
        // create freq map
        HashMap<Integer, Integer> candyTypes = new HashMap<>();
        for (int candy : candyType) {
            candyTypes.put(candy, candyTypes.getOrDefault(candy, 0) +1);
        }
        int numTypes = candyTypes.keySet().size();
        return Math.min(numTypes, candyType.length/2);
    }
    public static void main(String[] args) {
        int[] n1 = {1,1,2,2,3,3};
        System.out.println("Output1: " + distributeCandies(n1));
        int[] n2 = {1,1,2,3};
        System.out.println("Output2: " + distributeCandies(n2));
        int[] n3 = {6,6,6,6};
        System.out.println("Output3: " + distributeCandies(n3));
    }
}
/*
 * https://leetcode.com/problems/distribute-candies/description/
 * create freq map of candy
 * determine size of map
 * return min of map size or n/2
 */