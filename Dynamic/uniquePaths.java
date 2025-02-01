class uniquePaths {
    public static int unique(int m, int n) {
        
    }

    public static void main(String[] args) {
        int m1 = 3;
        int n1 = 7;
        System.out.println(unique(m1, n1)); // 28
    }
}

/*
 Like 2D climbing steps; for a cell,
 ways to reach [i][j] = ways[i-1][j] + ways[i][j-1]  
 */