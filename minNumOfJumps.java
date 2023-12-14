// unfinished

public class minNumOfJumps {
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;
// {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 0; i < n; i++) {
            if (i == n-1) return jumps;

            maxReach = Math.max(maxReach, i+arr[i]);
            steps--;
            System.out.println("17i: " + i);
            System.out.println("17arr[i]: " + arr[i]);
            System.out.println("17i+arr[i]): " + (i+arr[i]));
            System.out.println("18maxR: " + maxReach);
            System.out.println("19steps: " + steps);

            if (steps == 0) {
                jumps++;
                if (i >= maxReach) return -1;
                steps = maxReach - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 11;
        int arr[] = {1, 3, 5, 9, 7, 2, 6, 7, 6, 8, 9};
        System.out.println("Output: " + minJumps(arr));
    }
}
