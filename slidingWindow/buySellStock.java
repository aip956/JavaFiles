import java.util.*;
/*
{7,1,5,3,6,4}
buy at 7? but price[1] < 7, so don't buy at 7
move buy/left to 1, right to 5; prof = 4, maxProf = 4
price[left] = 1 . . . move right to 3, but prof < 4
price[left] = 1 . . . move right to 6, prof = 5, so maxProf = 5
p[left] = 1, still < p[right] = 4, prof = 3 . . . maxProf = 5
 * init left, right=1, prof, maxProf;
 * while right < prices.length
 * only calc prof if price:L < price:R
 * if price:l < price:r, calc prof, take max prof
 * else left = right
 */
public class buySellStock {
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int prof = 0;
        int maxProf = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                prof = prices[right] - prices[left];
                maxProf = Math.max(prof, maxProf);
            } else {
                left = right;
            }
            right++;
        }
        return maxProf;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // 5
    }
    

}