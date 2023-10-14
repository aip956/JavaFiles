/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Use min and max pointers, maxProfit
Start min at 0; max at 1, maxProfit = max - min; increment max to be max of remaining vals
increment min if < old min
*/
public class bestDayBuySellStock {
    public static int maxProfit(int[] prices) {
        int min = 0;
        int max = 1;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[max] - prices[min];
            
        }

    }



    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Output1: " + maxProfit(prices1));
    }
}
