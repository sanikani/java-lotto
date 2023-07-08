package lotto.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        isDuplicated(numbers);
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

    @Override
    public String toString() {
        return ""+numbers;
    }

    public void isDuplicated(List<Integer> inputNums) {
        List<Integer> distinctedArray = inputNums.stream()
                .distinct()
                .collect(Collectors.toList());
        if(distinctedArray.size()!=6){
            throw new IllegalArgumentException("[ERROR] 중복된 번호는 선택할수 없습니다.");
        }
    }
}
