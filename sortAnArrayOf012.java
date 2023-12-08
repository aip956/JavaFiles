public class sortAnArrayOf012 {
    public static void sort012(int a[], int n)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    swap(a, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a, mid, high);
                    high--;
                    break;
            }
        }
    }
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args) {
        int N = 5;
        int arr[] = {0, 2, 1, 2, 0};
        sort012(arr, N);
        System.out.print("Output: ");
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


/*
 * https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&sortBy=submissions
 * aka Dutch Flag
 * initialize 3 pointers, low, med, high
 * if the current element is 0, swap it with the element at the low ind and increment low and mid
 * if the current element is 1, just increment mid
 * if the current element is 2, swap it with the element at the high ind and decrement high
 * continue until mid crosses high
 */