package LeetCode.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int valorMinimo = Integer.MAX_VALUE;
        int lucroMaximo = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < valorMinimo) {
                valorMinimo = prices[i];
            } else if (prices[i] - valorMinimo > lucroMaximo) {
                lucroMaximo = prices[i] - valorMinimo;
            }
        }
        return lucroMaximo;
    }
}
