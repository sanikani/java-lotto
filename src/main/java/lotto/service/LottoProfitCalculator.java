package lotto.service;

import lotto.Rank;

import java.util.List;

public class LottoProfitCalculator {
    private static double totalProfit = 0;
    public static double totalProfit(List<Rank> ranks){

        for (Rank rank : ranks) {
            totalProfit += rank.getPrize();
        }
        return totalProfit;
    }

    public static void profitCalculator(double purchaseAmount){
        System.out.printf("총 수익률은 %.1f%%입니다\n", (double)(totalProfit/purchaseAmount)*100);
    }


}
