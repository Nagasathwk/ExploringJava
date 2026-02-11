import java.util.*;
import java.util.stream.Collectors;

public class OwnPractice {
    public static void main(String[] args) {
        List<Integer>num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list :");
        int size = sc.nextInt();
        for (int i =0; i<size;i++){
            System.out.println("enter the numbers:");
            num.add(sc.nextInt());
        }
        long addition =num.stream()
                .mapToLong(Integer::longValue)
                .sum();
        num.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
        int smallest = num.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        double avg = num.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        List<Integer>great = num.stream()
                .filter(n->n>avg)
                .toList();
        System.out.println("This is avg:" +avg + " this are greater than avg:"+ great );
        Map<Object, List<Integer>> result = num.stream()
                .collect(Collectors.groupingBy(n->n%2==0));
        System.out.println("even numbers:" +result.get(true));
        System.out.println("odd numbers:" +result.get(false));

        Map<Integer,Long>frequency = num.stream()
                .collect(Collectors.groupingBy(
                        n->n , Collectors.counting())
                );
        System.out.println(frequency);

        System.out.println("checking number:");
        int x =sc.nextInt();

        boolean greater = num.stream()
                .allMatch(n->n>x);
        System.out.println(greater);

        boolean lesser = num.stream()
                .anyMatch(n->n<x);
        System.out.println(lesser);

    };
}
