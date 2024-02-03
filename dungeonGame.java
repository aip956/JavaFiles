public class dungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int cols = dungeon[0].length;
        int rows = dungeon.length;
        int maxCummul = 0;

        for (int i = 0; i <= cols; i++) {
            for (int j = 0; j <= rows; j++) {
                int sum
            }
        }
        
    }


    public static void main(String[] args) {
        int dungeon[][] = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println("output: ", calculateMinimumHP(dungeon));
    }


}

/*
 * track cummulMin
 * iterate through subarrays
 *  cummulMin = Math.min(cummul, cummulMin)
 * 
 */