package practicing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NumberInput {

    public static List<Integer> getNumbers() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number:");
            numbers.add(sc.nextInt());
        }

        return numbers;
    }
}


