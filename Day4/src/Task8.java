import java.util.ArrayList;
import java.util.Collections;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajay");
        names.add("Ravi");
        names.add("Priya");
        System.out.println("BeforeSoring:" + names);
        Collections.sort(names);
        System.out.println("AfterSorting:" + names);
    }
}