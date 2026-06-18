import java.util.Arrays;
import java.util.List;
public class Task11 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
        System.out.println("Even Numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.print("\n Odd Numbers:");
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nSum= "+ sum);
        int max = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Maximum= "+ max);
        int min= numbers.stream()
                .min(Integer::compare)
                .get();
        System.out.println("Minimum= "+ min);
    }
}
