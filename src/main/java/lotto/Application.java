package lotto;


import camp.nextstep.edu.missionutils.Console;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        List<Lotto> lotto = new ArrayList<>();

        System.out.println("구입 금액을 입력해 주세요.");
        client.setPurchaseAmount(scanner.nextInt());
        System.out.println(client.getPurchaseNumbers() + "개를 구매했습니다.");

        for(int i=0; i<client.getPurchaseNumbers();i++){
            String[] split = scanner.next().split(",");
            int[] nums = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(nums);
            List<Integer> numbers
                    = Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toList());
            lotto.add(new Lotto(numbers));
        }

        for (Lotto num : lotto) {
            List<Integer> numbers = num.getNumbers();
            System.out.println(Arrays.deepToString(numbers.toArray()));
        }

        System.out.println("당첨 번호를 입력해 주세요");
        scanner.next().split(",");
        System.out.println("보너스 번호를 입력해 주세요");
        int bonusNumber = scanner.nextInt();
        System.out.println("당첨 통계");
        System.out.println("---");

    }
}
