interface animal{
    void sound();
}
class Cat implements animal{
    public void sound(){
        System.out.println("Cat meows");
    }
}



public class Task8 {
    public static void main(String[] args){
        Cat cat= new Cat();
        cat.sound();
    }
}
