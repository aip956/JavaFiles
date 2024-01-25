import java.util.*;

public class insertionSort {
    public static int[] insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("i: " + i);
            int j = i;
            System.out.println("9j: " + j);
            // while (j-1 >= 0) {
            while (j - 1 >= 0 && arr[j] < arr[j - 1]) {
                System.out.println("11j: " + j);
                System.out.println("12arr[j]: " + arr[j]);
                System.out.println("13arr[j-1]: " + arr[j-1]);
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp; 
                }
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {6, 1, 10, 3, 5};
        int[] result = insert(array);
        System.out.println(Arrays.toString(result));
    }
}


/*
 * Iterate through length of arr
 * While i >= 0
 *  If arr[i] < arr[i-1], swap
 */