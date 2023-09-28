// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1


public class waveArray {
    public static void convertToWave(int n, int[] a) {
        // code here
        for (int i = 0; i + 1 < n; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

    }


    public static void main(String[] args) {
        int n1 = 5;
        int arr1[] = {1,2,3,4,5};
        convertToWave(n1, arr1);
        System.out.println("Output: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
