package Arrays.Best_Time_To_Buy_And_Sell_Stocks;

public class BuyAndSellStocks {

    public static int buyAndSellStocks(int stocks[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < stocks.length; i++) {
            int currDayPrice = stocks[i];
            if (buyPrice < currDayPrice) {
                int profit = currDayPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = currDayPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int stocks[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(stocks));
    }
}
