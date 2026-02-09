package practicing;

import java.util.List;

public class SumUsingStream {

    public static long calculateSum(List<Integer> numbers) {
        return numbers.stream()
                .mapToLong(Integer::longValue)
                .sum();
    }
}
