import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class FindDupsInArr {
        public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        // create Set, add unique elements
        // if element not in Set, add to dups
        // Arrays.sort(arr);
        
        // Set<Integer> uniques = new HashSet<>();
        // for (int num : arr) {
        //     System.out.println("13Uniques: " + uniques);
        //     if (!uniques.contains(num)) {
        //         uniques.add(num);
        //         System.out.println("Uniques: " + uniques);
        //     }
        //     else if (!dups.contains(num)) {
        //         dups.add(num);
        //         System.out.println("Dups: " + dups);
        //     }
        // }
        // if (dups.size() == 0) {
        //     dups.add(-1);
        // }
        // return dups;

            // create frequency HashMap
            ArrayList<Integer> dups = new ArrayList<>();
            Arrays.sort(arr);
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for (int num : arr) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
            for (int num : freqMap.keySet()) {
                if (freqMap.get(num) > 1) {
                    dups.add(num);
                }
            }
            if (dups.size() == 0) {
            dups.add(-1);
            }
            Collections.sort(dups);
        return dups;

    }



    public static void main(String[] args) {
        // int arr[] = {0, 3, 1, 2};
        // int n = 4;
        // int arr[] = {2,3,1,2,3};
        // int n = 5;
        int arr[] = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        int n = 26;
        ArrayList<Integer> output = duplicates(arr, n);
        System.out.println("Output: " + output); // Output: 
    }
}
