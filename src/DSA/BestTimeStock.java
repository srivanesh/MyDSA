package DSA;

public class BestTimeStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Int index:"+maxProfit(prices));
    }

    public static  int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int profit = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else{
                System.out.println(prices[i] - min);
                profit = Math.max(profit, prices[i] - min);
            }
        }
        return profit;

    }
}
