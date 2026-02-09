package practicing;

import java.util.List;

public class MaxUsingStream {

    public static int findMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo).get();
    }
}
