public class equilPoint {
    public static int equilibriumPoint(long arr[], int n) {
        // get sum of arr
        // start a left sum, subtract each element from total
        // if leftSum == total; that's the equil point!

        long arrSum = 0;
        long leftSum = 0;
        for (long num : arr) {
            arrSum += num;
        }

        for (int i = 0; i < n; i++) {
            arrSum -= arr[i];
            // System.out.println("leftSum: " + leftSum);
            // System.out.println("arrSum: " + arrSum);
            if (leftSum == arrSum) {
                return i+1;
            }
            leftSum += arr[i];
        }
        return -1;
    }



    public static void main(String[] args) {
        long arr[] = {1,3,5,2,2};
        int n = 5;
        Integer output = equilibriumPoint(arr, n);
        System.out.println("Output: " + output); // Output: 
    }
}
