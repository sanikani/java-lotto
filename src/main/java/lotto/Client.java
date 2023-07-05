package lotto;

import java.util.List;

public class Client {
    private int purchaseAmount;
    private List<Integer> numbers;
    private int purchaseNumbers;

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public int getPurchaseNumbers(){
        return purchaseAmount/1000;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }


}
