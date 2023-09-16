public class kadanes {
    long maxSubarraySum(int arr[], int n){
        
        // Each element in array
        // create maxEndingHere: max of num vs. sum num+maxEndHere
        // maxSoFar: max of maxSoFar and maxEndingHere
        long maxEndHere = arr[0];
        long maxSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            maxEndHere = Math.max(arr[i], arr[i]+maxEndHere);
            System.out.println("maxEndHere: " + maxEndHere);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
            System.out.println("maxSoFar: " + maxSoFar);
        }
        return maxSoFar;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        int n = 5;
        kadanes kadanesInst = new kadanes();
        Long output = kadanesInst.maxSubarraySum(arr, n);
        System.out.println("Output: " + output); // Output: 
    }
}
