class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id= id;
        this.name= name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Task2{
    public static void main(String[] args){
        Employee emp = new Employee(101, "Saloni");
        emp.display();

    }
}

