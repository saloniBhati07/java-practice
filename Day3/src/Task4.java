class Person {
    String name;
}
class Employeee extends Person{
    int salary;
    void display(){
        System.out.println(name+" "+salary);
    }
}





public class Task4 {
    public static void main(String[] args){
Employeee E1= new Employeee();
E1.name= "saloni";
E1.salary=30000;
E1.display();

    }
}
