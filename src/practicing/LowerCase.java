package practicing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        List<String> names = new ArrayList<>();
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("enter the uppercase strings :");
            names.add(sc.next());

        }
        names.stream()
                .map(String::toLowerCase)
                .toList()
                        .forEach(System.out::println);
        names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        List <String> result =names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("remove duplicates :" + result);






    }
}
