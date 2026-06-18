import java.util.Arrays;
import java.util.List;
public class Task5 {
    public static void main(String[] args){
        List<String> names= Arrays.asList("ajay", "ravi","priya");
        names.stream()
                .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}
