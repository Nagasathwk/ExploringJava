package practicing;

import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static List<Integer>  removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());

    }
}
