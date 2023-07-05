package lotto.service;

import lotto.Rank;
import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoResultChecker {

    public static List<Rank> resultChecker(List<Lotto> lottos, int[] lottoNums, int bonusNum){
        int[] cnt = new int[lottos.size()];
        boolean[] hasBonusNum = new boolean[lottos.size()];
        int i = 0;
        int j = 0;
        List<Rank> ranks = new ArrayList<>();
        for (Lotto lotto : lottos) {
            cnt[i] = check(lotto, lottoNums);
            i++;
        }
        for (Lotto lotto : lottos) {
            hasBonusNum[j] = hasBonusNumber(lotto, bonusNum);
            j++;
        }
        for(int k=0; k<lottos.size(); k++){
            ranks.add(Rank.findRanking(cnt[k], hasBonusNum[k]));
        }
        return ranks;
    }

    public static int check(Lotto lotto, int[] lottoNums){
        int cnt = 0;
        for (int lottoNum : lottoNums) {
            if(lotto.getNumbers().contains(lottoNum)){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean hasBonusNumber(Lotto lotto, int bonusNum){
        if(lotto.getNumbers().contains(bonusNum)){
            return true;
        }
        return false;
    }

}
