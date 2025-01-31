class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) return 0;
        // create dp array
        int[] minCoins = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            minCoins[i] = Integer.MAX_VALUE;

            // Try each coin 
            for (int coin : coins) {
                if (coin <= i && minCoins[i-coin] != Integer.MAX_VALUE) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i-coin]);
                }
            }
        }
        // if (minCoins[amount] == Integer.MAX_VALUE) return -1;

        return minCoins[amount] == Integer.MAX_VALUE ? -1 : minCoins[amount];
    }

    public static void main(String[] args) {
        int[] coins1 = {1,2,5};
        int amount1 = 11;
        System.out.println(coinChange(coins1, amount1));
        System.out.println();

        int[] coins2 = {2};
        int amount2 = 3;
        System.out.println(coinChange(coins2, amount2));
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
2: 2 coins: remainder 1 (1 from 1, plus 1 for 2)
3: 1 of 1, plus 2 from 2; 3
4: coin 1, remain 3; 3 from 3 plus 1 for 4
5: coin 5 or 1; 1x1: rem = 4; 1x5 rem = 0; min = 1 coin 5
6: coin 6 or 5 or 1
store min # coins to get to all amounts

 */