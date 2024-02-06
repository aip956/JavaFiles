public class countInversion {
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here; count inversions

    }

    public static void main(String[] args) {
        // long[] arr = {2, 4, 1, 3, 5};
        // long N = 5;
        // long[] arr = {2, 3, 4, 5, 6};
        // long N = 5;
        long[] arr = {10, 10, 10};
        long N = 3;
        System.out.println(inversionCount(arr, N));
    }
}



/* This solution works but is O(N^2) so times out; use merge sort instead
 *         long count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                    System.out.println("i: " + i + ", j: " + j + ", count: " + count);
                }
            }
        }
        return count;
 */