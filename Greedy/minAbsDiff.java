import java.util.List;
import java.util.*;

class minAbsDiff {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        // error check
        if (arr == null || arr.length == 0) return null;

        // sort
        Arrays.sort(arr);
        // iterate
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
        }


        // return
    }

    public static void main(String[] args) {
        int[] arr1 = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr1));
    }
}