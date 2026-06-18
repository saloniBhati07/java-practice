import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args){
        List<Integer> salaries= Arrays.asList(3000000, 456780,600000,890000);
        salaries.stream()
                .filter(salary -> salary > 500000)
                .forEach(System.out::println);
    }
}
