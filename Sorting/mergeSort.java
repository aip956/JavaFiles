import java.util.*;

public class mergeSort {
    public static void mergeSort(int[] arr) {
        // if array is empty or 1 element
        if (arr.length <= 1 || arr == null) { return; }


        
    }



    public static void main (String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(array);
        System.out.println("Output: " + Arrays.toString(array));
    }
}
