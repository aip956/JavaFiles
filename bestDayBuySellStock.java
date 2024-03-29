/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Use min and max pointers, maxProfit
Start min at 0; max at 1, maxProfit = max - min; increment max to be max of remaining vals
increment min if < old min
left and right pointer; left = 0; right = 1
maxProf = 0
while r < prices.length
profitable? If prices[left] < prices[right], profit = prices left - prices right
maxProf = Max (maxProf, prof)
else; update left pointer; left = right
update right+1
return maxP

*/
public class bestDayBuySellStock {
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        int maxProf = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                profit = prices[right] - prices[left];
                maxProf = Math.max(maxProf, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProf;
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
        // int min = 0;
        // int max = 1;
        // int profit = 0;
        // int maxProfit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     min = Math.min(prices[min], prices[i]);
        //     profit = prices[max] - prices[min];
        //     maxProfit = Math.max(profit, maxProfit);
        //     System.out.println("i: " + i);
        //     System.out.println("prices[max]: " + prices[max]);
        //     System.out.println("prices[min]: " + prices[min]);
        //     System.out.println("profit: " + profit);
        //     max = i;
        // }
        // return maxProfit;
    }


    public static void main(String[] args) {
        // int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println("Output1: " + maxProfit(prices2));
    }
}
