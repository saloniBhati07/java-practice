@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class Task1 {
    public static void main(String[] args){
        Greeting greeting =()-> System.out.println("Hello Java 8");
        greeting.sayHello();
    }
}
