import java.util.Arrays;
import java.util.List;
public class Task9 {
    public static void main(String[] args){
        List<String> employees =Arrays.asList("Ravi", "Ajay", "Priya","Ravi", "Ajay");
        employees.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
