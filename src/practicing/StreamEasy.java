package practicing;

import java.util.List;

public class StreamEasy {
    public static void main(String[] args) {

        List<Integer> numbers = NumberInput.getNumbers();
        System.out.println(numbers);

        long sum = SumUsingStream.calculateSum(numbers);
        System.out.println("Sum: " + sum);

        int max = MaxUsingStream.findMax(numbers);
        System.out.println("Max: " + max);

        int min =MinUsingStream.findMin(numbers);
        System.out.println("Min:" + min);

        List<Integer> Nodupli=Duplicates.removeDuplicates(numbers);
        System.out.println("no duplicates:"+ Nodupli);

    }
}
