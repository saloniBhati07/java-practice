import java.util.Arrays;
import java.util.List;
public class Task8 {
    public static void main(String[] args){
        List<Integer> salaries = Arrays.asList(300000,600000,7895840,25677,5676);
        int maxSalary = salaries.stream()
                .max(Integer::compare)
                .get();
        System.out.println(maxSalary);
    }
}
