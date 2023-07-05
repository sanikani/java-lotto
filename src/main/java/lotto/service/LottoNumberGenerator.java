package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumberGenerator {
    public List<Lotto> lottoGenerator(int lottoAmount) {
        List<Lotto> lottos = new ArrayList<>();

        for(int i=0; i<lottoAmount;i++){
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Lotto lotto = new Lotto(numbers);
            System.out.println(lotto);
            lottos.add(lotto);
        }
        return lottos;
    }
}
