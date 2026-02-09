package practicing;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreamsAPIExample {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        System.out.println("Primitive Array: "+ Arrays.toString(number));
        List<Integer> convertedArray = Arrays.stream(number).boxed().toList();
        System.out.println("Converted Array: "+ convertedArray);//convert from primitive to ArrayList
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 2, 3, 5, 6));  //pre initialization
        System.out.println("Pre Intialized Array: "+numbers);
        List<Integer> num = new ArrayList<>();  //dynamic
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        for (int i =0; i<size; i++){
            System.out.println("Enter for index: "+i);
            num.add(scanner.nextInt());
        }
        System.out.println(num);
        //count of even and odd numbers
        //old
        long evenCount =0, oddCount=0;
        for(Integer n: numbers){
            if(n%2 == 0){
                evenCount+=1;
            }else{
                oddCount+=1;
            }
        }
        System.out.println("Even Count: "+ evenCount);
        System.out.println("Odd Count: "+ oddCount);
        //Streams
        evenCount = numbers.stream()
                .filter(n -> n%2 == 0)
                .count();
        oddCount = numbers.stream()
                .filter(n -> n%2 != 0)
                .count();
        System.out.println("Even Count: "+ evenCount);
        System.out.println("Odd Count: "+ oddCount);

        //Sort Techniques

        Collections.sort(numbers);
        System.out.println("Sorted Array: "+ numbers);

        List<Integer> numSortedArray = num.stream()
                .sorted()
                .toList();
        System.out.println(numSortedArray);

        //distinct
        Optional<Integer> distinctNumber = num.stream()
                        .distinct()
                                .findFirst();

        System.out.println("Dis: "+ distinctNumber);

       numbers.stream()
                .collect(Collectors.groupingBy(
                        val -> val, Collectors.counting()
                ))
                        .keySet()
                                .forEach(System.out::println);

        List<User> userList = new ArrayList<>();
        User siva = new User("Siva", 26, "Hyderabad");
        User sathvik = new User("Sathwik", 22, "Hyderabad");
        User raghu = new User("Raghu", 22, "Banglore");

        userList.add(siva);
        userList.add(sathvik);
        userList.add(raghu);

        System.out.println("Users: "+ userList);

        userList.stream()
                .filter(user -> user.getCity().equalsIgnoreCase("hyderabad"))
                .toList()
                .forEach(System.out::println);

        userList.stream()
                .filter(user -> user.getAge() > 22)
                .map(user -> {
                    user.setCity("Banglore");
                    return user;
                })
                .forEach(System.out::println);
        String s = "abcbcc";
        s.chars()
                .mapToObj(val -> (char) val)
                .collect(Collectors.groupingBy(val ->
                        val, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);


    }
}

class User{

    String name;
    Integer age;
    String city;

    User(String name, Integer age, String city){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}


