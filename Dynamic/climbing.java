
class climbing {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        else return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
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