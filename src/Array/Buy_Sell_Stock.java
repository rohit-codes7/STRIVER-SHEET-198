package Array;

public class Buy_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    //    public static int maxProfit(int[]prices){
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
//
//
//            }
//
//        }
//        return maxProfit;
//    }
    public static int maxProfit(int[] prices) {
        //two pointers to buy and sell
        int buy_price = prices[0];
        int current_profit=0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            buy_price       =   Math.min(buy_price,prices[i]);
            current_profit  =   prices[i]-buy_price;
            maxProfit       =   Math.max(maxProfit,current_profit);

        }

        return maxProfit;

    }
}
