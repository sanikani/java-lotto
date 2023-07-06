package lotto.service;

import lotto.Rank;

import java.util.List;

public class LottoProfitCalculator {
    private static double totalProfit = 0;
    public static double totalProfit(List<Rank> ranks){

        for (Rank rank : ranks) {
            totalProfit += rank.getPrize();
        }
        System.out.println("totalProfit = " + totalProfit);
        return totalProfit;
    }

    public static double profitCalculator(double purchaseAmount){
        return (double)(totalProfit/purchaseAmount)*100;
    }


}
