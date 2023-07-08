package lotto.controller;

import lotto.Rank;
import lotto.domain.Lotto;
import lotto.service.LottoNumberGenerator;
import lotto.service.LottoProfitCalculator;
import lotto.service.LottoResultChecker;
import lotto.view.Input;
import lotto.view.Output;

import java.util.List;

public class LottoController {
    private static final Input input = new Input();
    public static final LottoNumberGenerator LOTTO_NUMBER_GENERATOR = new LottoNumberGenerator();
    public static final int LOTTO_PRICE = 1000;
    public void start(){
        int inputAmount = Input.inputAmount();
        int lottoAmount = inputAmount / LOTTO_PRICE;
        List<Lotto> lotto = LottoNumberGenerator.lottoGenerator(lottoAmount);
        List<Rank> ranks = LottoResultChecker.resultChecker(lotto,input.inputLottoNums(), input.inputBonusNum());
        Output.rankCount(ranks);
        Output.result();
        LottoProfitCalculator.totalProfit(ranks);
        LottoProfitCalculator.profitCalculator(inputAmount);

    }



}
