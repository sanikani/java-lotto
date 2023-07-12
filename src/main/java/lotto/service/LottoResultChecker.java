package lotto.service;

import lotto.Rank;
import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoResultChecker {

public static List<Rank> resultChecker(List<Lotto> lottos, int[] lottoNums, int bonusNum) {
    List<Rank> ranks = new ArrayList<>();

    for (Lotto lotto : lottos) {
        int count = countMatchingNumbers(lotto, lottoNums);
        boolean hasBonusNumber = hasBonusNumber(lotto, bonusNum);
        Rank rank = Rank.findRanking(count, hasBonusNumber);
        ranks.add(rank);
    }

    return ranks;
}

    private static int countMatchingNumbers(Lotto lotto, int[] lottoNums) {
        int count = 0;

        for (int lottoNum : lottoNums) {
            if (lotto.getNumbers().contains(lottoNum)) {
                count++;
            }
        }

        return count;
    }

    private static boolean hasBonusNumber(Lotto lotto, int bonusNum) {
        return lotto.getNumbers().contains(bonusNum);
    }

}

