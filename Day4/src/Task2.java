import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Ravi");
        list.add("Priya");
        System.out.println("using for loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("\n using enhanced for loop");
        for(String name:list){
            System.out.println(name);
        }
    }
}

