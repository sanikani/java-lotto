package lotto.view;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);
    private static final String INPUT_AMOUNT = "구입 금액을 입력해 주세요.";
    private static final String INPUT_LOTTO_NUMS = "당첨 번호를 입력해 주세요";
    private static final String INPUT_BONUS_NUM = "보너스 번호를 입력해 주세요";

    public int inputAmount(){
        System.out.println(INPUT_AMOUNT);
        int money = sc.nextInt();
        if(money%1000 != 0){
            throw new IllegalArgumentException("[ERROR] 1000원 단위로 입력해 주세요");
        }
        return money;
    }

    public int[] inputLottoNums(){
        System.out.println(INPUT_LOTTO_NUMS);
        int[] inputNums = toInt(sc.next().split(","));
        if(inputNums.length != 6){
            throw new IllegalArgumentException("[ERROR] 6개의 번호를 입력해 주세요");
        }
        for (int inputNum : inputNums) {
            if(inputNum<0 || inputNum > 45){
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1~45까지 입니다.");
            }
        }
        return inputNums;
    }

    public int inputBonusNum(){
        System.out.println(INPUT_BONUS_NUM);
        int BonusNum = sc.nextInt();
        if(BonusNum<0 || BonusNum > 45){
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1~45까지 입니다.");
        }
        return BonusNum;
    }

    public int[] toInt(String[] strNumbers){
        int[] nums = new int[strNumbers.length];
        for(int i=0; i< strNumbers.length;i++){
            nums[i] = Integer.parseInt(strNumbers[i]);
        }
        return nums;
    }

}

