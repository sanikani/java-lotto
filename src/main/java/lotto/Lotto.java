package lotto;

import java.util.Arrays;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        for (Integer number : numbers) {
            if(number<0 || number > 45){
                throw new IllegalArgumentException();
            }
        }
    }
    public List<Integer> getNumbers() {
        return numbers;
    }
}
