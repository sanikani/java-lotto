package lotto.view;

import lotto.Rank;
import lotto.domain.Lotto;

import java.util.List;

public class Output {
    public void purchaseAmount(int inputAmount){
        int lottoAmount = inputAmount/1000;
        System.out.println(lottoAmount + "개를 구매했습니다.");
    }
    private static final Rank[] ranking = {Rank.FIRST,Rank.SECOND,Rank.THIRD,Rank.FOURTH,Rank.FIFTH,Rank.DEFAULT};
    private static int[] rankCnt = new int[ranking.length];

    public static void result(){
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.printf("3개 일치 (5,000원) - %d개\n",rankCnt[4]);
        System.out.printf("4개 일치 (50,000원) - %d개\n",rankCnt[3]);
        System.out.printf("5개 일치 (1,500,000원) - %d개\n",rankCnt[2]);
        System.out.printf("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개\n",rankCnt[1]);
        System.out.printf("6개 일치 (2,000,000,000원) - %d개\n",rankCnt[0]);

    }

    public static int[] rankCount(List<Rank> ranks) {
        for (int i = 0; i < ranking.length; i++) {
            for (Rank rank : ranks) {
                counter(i, rank);
            }
        }
        return rankCnt;
    }

    private static void counter(int i, Rank rank) {
        if (rank == ranking[i]) {
            rankCnt[i]++;
        }
    }
}
