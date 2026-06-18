import java.util.Arrays;
import java.util.List;
public class Task6 {
    public static void main(String[] args){
        List<String> names =Arrays.asList("Ravi", "Ajay", "Priya");
        names.stream()
        .sorted()
                .forEach(System.out::println);
    }
}
