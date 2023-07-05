package lotto.view;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);
    private static final String INPUT_AMOUNT = "구입 금액을 입력해 주세요.";
    private static final String INPUT_LOTTO_NUMS = "당첨 번호를 입력해 주세요";
    private static final String INPUT_BONUS_NUM = "보너스 번호를 입력해 주세요";

    public int inputAmount(){
        System.out.println(INPUT_AMOUNT);
        return sc.nextInt();
    }

    public int[] inputLottoNums(){
        System.out.println(INPUT_LOTTO_NUMS);
        return toInt(sc.nextLine().split(","));
    }

    public int inputBonusNum(){
        System.out.println(INPUT_BONUS_NUM);
        return sc.nextInt();
    }

    public int[] toInt(String[] strNumbers){
        int[] nums = new int[strNumbers.length];
        for(int i=0; i< strNumbers.length;i++){
            nums[i] = Integer.parseInt(strNumbers[i]);
        }
        return nums;
    }

}

