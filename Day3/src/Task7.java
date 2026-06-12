abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car Starts with key");

    }
}



public class Task7 {
    public static void main(String[] args){
        Car c = new Car();
        c.start();

    }
}
