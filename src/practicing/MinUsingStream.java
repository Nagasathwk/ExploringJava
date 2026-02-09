package practicing;


import java.util.List;
public class MinUsingStream {
    public static int findMin(List<Integer> numbers) {
        return numbers.stream()
                .min(Integer::compareTo)
                .get();


    }
}
