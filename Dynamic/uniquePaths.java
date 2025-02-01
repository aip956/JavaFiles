class uniquePaths {
    public static int unique(int m, int n) {
        if (m < 1 || n < 1) return 0;
        int[][] grid = new int[m][n];
        // iterate over grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we are at the 1st row or 1st col
                // only 1 way to reach that cell
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } else {
                    // Memoize the  num of ways to reach that cell
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }

            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int m1 = 3;
        int n1 = 7;
        System.out.println(unique(m1, n1)); // 28
    }
}

/*
https://leetcode.com/problems/unique-paths/
Time: O(mxn)
Space: O(mxn)
 Like 2D climbing steps; for a cell,
 ways to reach [i][j] = ways[i-1][j] + ways[i][j-1]  
 */