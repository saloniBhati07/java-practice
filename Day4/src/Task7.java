import java.util.ArrayList;
class Employeeee{
    int id;
    double salary;
    String name;
    Employeeee(int id ,String name,double salary){
        this.id= id;
        this.name= name;
        this.salary=salary;
    }
    void display(){
        System.out.println("ID:"+id +",Name:"+name+",Salary:"+salary);
    }
}
public class Task7{
    public static void main(String[] args){
        ArrayList<Employeeee> employees= new ArrayList<>();
        employees.add(new Employeeee(101,"Ajay",30000));
        employees.add(new Employeeee(102, "Saloni",3000000));
        employees.add(new Employeeee(103, "Shikha",340000));
        System.out.println("employee details:");
        for(Employeeee emp:employees){
            emp.display();
        }
    }
}
