import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args){
        //arraylist
        System.out.println("ArrayList-");
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("c++");
        System.out.println("elements:"+list);
        list.set(1,"Javascript");
        System.out.println("After update:" +list);
        list.remove("c++");
        System.out.println("After removing:"+list);
        //hashset
        System.out.println();
                System.out.println("Hashset-");
        HashSet<String > set= new HashSet<>();
        set.add("Apple");
        set.add("banana");
        set.add("Apple");
        System.out.println("Elements:"+ set);
        set.remove("Banana");
        set.add("Orange");
        System.out.println("After Update:"+set);

        set.remove("Orange");
        System.out.println("After Delete:"+set);

    //hashmap
        System.out.println();
        System.out.println("Hashmap-");
        HashMap<Integer, String> map= new HashMap<>();
        map.put(101,"saloni");
        map.put(202,"Rahul");
        map.put(103,"Priya");
        System.out.println("Map:"+ map);
        map.put(202,"Amit");
        map.remove(103);
        System.out.println("After delete:" + map);

        //iterator
        System.out.println();
        System.out.println("Iterator-");
        Iterator<String> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
