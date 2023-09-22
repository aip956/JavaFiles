// https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

public class equilPoint {
    public static int equilibriumPoint(long arr[], int n) {
        // get sum of arr
        // start a left sum, subtract each element from total
        // if leftSum == total; that's the equil point!
         // Total Array Sum = 1,3,5,2,2 = 13
        // Sub elem from Total; 
        // if leftsum == total; return ind+1
        // leftsum + elem
        // leftsum = 0
        // total-1=12; leftsum+1=1
        // total-3=9; leftsum+3=4
        // 9-5 = 4; 

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
