package lotto.view;

public class Output {
    public void purchaseAmount(int inputAmount){
        int lottoAmount = inputAmount/1000;
        System.out.println(lottoAmount + "개를 구매했습니다.");
    }

    public void result(){
        System.out.println("당첨 통계");
        System.out.println("---");
    }


}
