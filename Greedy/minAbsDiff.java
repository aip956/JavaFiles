import java.util.List;
import java.util.*;

class minAbsDiff {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        // error check
        if (arr == null || arr.length == 0) return null;
        // sort
        Arrays.sort(arr);
        // declare result
        List<List<Integer>> result = new ArrayList<>();
        // iterate
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                result.clear(); // remove previous pairs
                result.add(Arrays.asList(arr[i - 1],arr[i]));
            } else if (diff == minDiff) {
                minDiff = diff;
                result.add(Arrays.asList(arr[i - 1],arr[i]));
            }
        }
        // return
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr1));
    }
}