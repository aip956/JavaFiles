/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Use min and max pointers, maxProfit
Start min at 0; max at 1, maxProfit = max - min; increment max to be max of remaining vals
increment min if < old min
*/
public class bestDayBuySellStock {
    public static int maxProfit(int[] prices) {
    //     int min = prices[0];
    //     int max = 1;
    //     int profit = 0;
    //     int maxProfit = 0;
    //     for (int i = 0; i < prices.length-1; i++) {
    //         System.out.println("i: " + i);
    //         if (prices[i] == Math.min(prices[i], prices[min]) ) {
    //             profit = prices[max] - prices[min];
    //             maxProfit = Math.max(maxProfit, profit);
    //             System.out.println("16maxProf: " + maxProfit);
    //             min = i;
    //         }
    //     }
    //     return maxProfit;
    // }
        int min = prices[0];
        int max = prices[1];
        
        for (int i = 1; i <= prices.length; i++) {
            int maxProfit = prices[max] - prices[min];
            if (prices[i] < prices[i+1]) {
                min = prices[i+1]
            }
        }


    }


    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Output1: " + maxProfit(prices1));
    }
}
