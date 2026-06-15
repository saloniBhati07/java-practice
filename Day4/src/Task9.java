import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Ravi");
        list.add("Ajay");
        list.add("Priya");
        list.add("Ravi");
        System.out.println("Original list:" + list);
        Set<String> uniqueSet = new HashSet<>(list);
        System.out.println("List After removing Duplicates:" + uniqueSet);
    }
}
