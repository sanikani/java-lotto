package lotto;


import lotto.domain.Lotto;
import lotto.service.LottoNumberGenerator;
import lotto.service.LottoProfitCalculator;
import lotto.service.LottoResultChecker;
import lotto.view.Input;
import lotto.view.Output;

import java.util.*;
import java.util.stream.Collectors;

import static lotto.service.LottoProfitCalculator.*;

public class Application {
    public static void main(String[] args) {
        LottoNumberGenerator lg = new LottoNumberGenerator();
        Input input = new Input();
        int inputAmount = input.inputAmount();
        int lottoAmount = inputAmount/1000;
        List<Lotto> lotto = lg.lottoGenerator(lottoAmount);
        int[] lottoNums = input.inputLottoNums();
        int bonusNum = input.inputBonusNum();
        List<Rank> ranks = LottoResultChecker.resultChecker(lotto, lottoNums, bonusNum);
        Output.rankCount(ranks);
        Output.result();
        double totalProfit = totalProfit(ranks);
        double profit = profitCalculator(inputAmount);
        System.out.printf("총 수익률은 %.1f%%입니다\n", profit);
    }
}
