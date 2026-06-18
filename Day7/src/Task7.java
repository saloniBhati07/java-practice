import java.util.Arrays;
import java.util.List;
public class Task7 {
    public static void main(String[] args){
        List<Integer> salaries = Arrays.asList(300000,600000,7895840,25677,5676);
       long count= salaries.stream()
               .filter(salary -> salary>50000)
               .count();
       System.out.println(count);
    }
}
