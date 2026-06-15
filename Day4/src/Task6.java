import java.util.HashMap;
import java.util.Map;
public class Task6 {
    public static void main(String[] args){
        HashMap<Integer , String> map = new HashMap<>();
        map.put(101, "Ajay");
        map.put(102, "Ravi");
        System.out.println("Key-value pairs:");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("key:"+ entry.getKey()+ ", Value:" + entry.getValue());
        }
    }

}