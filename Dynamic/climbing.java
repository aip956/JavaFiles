
class climbing {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        // else return climbStairs(n - 1) + climbStairs(n - 2); // this is slow
        // int[] nums = new int[n + 1];
        // nums[0] = 1;
        // nums[1] = 1;
        // for (int i = 2; i <= n; i++) {
        //     nums[i] = nums[i-1] + nums[i-2];
        // }
        // return nums[n];

        int n_first = 1;
        int n_sec = 1;
        int sum_i = 0;
        for (int i = 2; i <= n; i++) {
            System.out.println("i: " + i);
            System.out.println("n_first: " + n_first);
            System.out.println("n_sec: " + n_sec);
            sum_i = n_first + n_sec; // 2
            System.out.println("sum_i: " + sum_i);
            n_first = n_sec; // 1
            n_sec = sum_i; // 2
        }
        return sum_i;
    }

    // but we only need to save 2 numbers in the array


    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}


/*
 * num_ways(n) = num_ways(n-1) + num_ways(n-2)
 * n=0, nw = 1
 * n=1, nw = 1
 * n=2, nw = 2
 * n=3, nw = 2+1=3
 * n=4, nw=3+2=5
 * count from top stair = 0
 */