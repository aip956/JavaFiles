import java.util.HashMap;

public class lgstSubarrZeroSum {
    static int maxLen(int arr[], int n)
    {
        // Your code here
        // create a hashset
        // for each element check total; if in the hash get max of maxLen, index - ind of totalInHash
        // if not in hash, put it in

        // System.out.println(n);
        HashMap<Integer, Integer> totals = new HashMap<>();
        int sum = 0;
        int largestLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                largestLen = i +1;
            }
            
            else if (totals.containsKey(sum)) {
                largestLen = Math.max(largestLen, i - totals.get(sum));
            }
            else {
                totals.put(sum, i);
            }
        }
        return largestLen;

    }


    public static void main(String[] args) {
        // int arr[] = {15,-2,2,-8,1,7,10,23};
        // int n = 8;
        int arr[] = {-1, 1, -1, 1};
        int n = 4;
        int output = maxLen(arr, n);
        System.out.println("Output: " + output); // Output: 
    }
}
