import java.util.ArrayList;

public class Task3{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Ravi");
        list.add("Priya");
        System.out.println("Original list:"+list);
        System.out.println("Element at index 1:"+ list.get(1));
        System.out.println("Size of list:" +list.size());
        list.remove("Ravi");
        System.out.println("List after removing Ravi:"+ list);
    }
}

