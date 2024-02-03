public class dungeonGame {
    public static int calculateMinimumHP(int[][] dungeon) {
        int cols = dungeon[0].length;
        int rows = dungeon.length;
        int minCummul = 0;
        

        for (int i = 0; i <= cols; i++) {
            int sum = 0;
            for (int j = 0; j <= rows; j++) {
                sum += dungeon[i][j];
                minCummul = Math.min(minCummul, sum);

            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int dungeon[][] = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println("output: " + calculateMinimumHP(dungeon));
    }


}

/*
 * track cummulMin
 * iterate through subarrays
 *  cummulMin = Math.min(cummul, cummulMin)
 * 
 */