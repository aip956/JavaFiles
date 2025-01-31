class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount == 0) return -1;


        return -1;
    }

    public static void main(String[] args) {
        int[] coins1 = {1,2,5};
        int amount1 = 11;
        System.out.println(coinChange(coins1, amount1));
        System.out.println();

        int[] coins2 = {2};
        int amount2 = 3;
        System.out.println(coinChange(coins1, amount1));
        // -1


    }
}

/*
 You are given an integer array coins representing 
 coins of different denominations and an integer 
 amount representing a total amount of money.

Return the fewest number of coins that you need 
to make up that amount. If that amount of money 
cannot be made up by any combination of the coins, 
return -1.

You may assume that you have an infinite number 
of each kind of coin.

 

Example 1:
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

Example 2:
Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0

1, 5, 6, 9; amount = 11
amount:
0: no coins
1: 1 coin

 */