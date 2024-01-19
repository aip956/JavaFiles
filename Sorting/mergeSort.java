import java.util.*;

public class mergeSort {
    public static void mergeSort(int[] arr) {
        // if array is empty or 1 element
        if (arr.length <= 1 || arr == null) { return; }
        // find mid index, copy left half and right half into leftArr and rightArr
        // mergeSort leftArr and rightArr, then merge
        int mid = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, arr.length - 1);


        // merge: i, j, k; while i<left length, j<rightlength
        // array[k++] = right or left
        private static void merge(int[] left; int[] right; int[] sorted) {
            int i = 0, j = 0, k = 0;
        }
    }



    public static void main (String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(array);
        System.out.println("Output: " + Arrays.toString(array));
    }
}
