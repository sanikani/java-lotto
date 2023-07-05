package lotto;


import lotto.domain.Lotto;
import lotto.service.LottoNumberGenerator;
import lotto.service.LottoResultChecker;
import lotto.view.Input;
import lotto.view.Output;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        LottoNumberGenerator lg = new LottoNumberGenerator();
        Input input = new Input();
        int lottoAmount = input.inputAmount();
        List<Lotto> lotto = lg.lottoGenerator(lottoAmount);
        int[] lottoNums = input.inputLottoNums();
        int bonusNum = input.inputBonusNum();
        List<Rank> ranks = LottoResultChecker.resultChecker(lotto, lottoNums, bonusNum);
        for (Rank rank : ranks) {
            System.out.printf("%d개 일치 (%d원) - 개\n",rank.getCount(),rank.getPrize());
        }
    }
}
