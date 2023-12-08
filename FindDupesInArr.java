import java.util.*;
public class FindDupesInArr {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList <Integer> dupes = new ArrayList<>();
        for (int element : arr) {
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }
        for (int element : freqMap.keySet()) {
            if (freqMap.get(element) > 1) {
                dupes.add(element);
            }
        }
        if (dupes.size() == 0) {
            dupes.add(-1);
        }
        Collections.sort(dupes);
        return dupes;
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


        // works but times out
    // ArrayList<Integer> dupes = new ArrayList<>();
    // ArrayList<Integer> uniques = new ArrayList<>();
    // for (int element : arr) {
    //     if (!uniques.contains(element)) {
    //         uniques.add(element);
    //         System.out.println("Uniques: " + uniques);
    //     } else {
    //         if (!dupes.contains(element)) {
    //             dupes.add(element);
    //             System.out.println("Dupes: " + dupes);
    //         }
    //     }
    // }
    // if (dupes.size() == 0) {
    //     dupes.add(-1);
    // }
    // Collections.sort(dupes);
    // return dupes;