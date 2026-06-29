import java.util.ArrayList;
import java.util.List;

class Employeee{
    int id;
    String name;
    double salary;
    Employeee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Task7 {
    public static void main(String[] args){
        List<Employeee> employess = new ArrayList<>();
        employess.add(new Employeee(101,"Saloni",45000));
        employess.add(new Employeee(102,"Anil",45669));
        employess.add(new Employeee(103,"Sunil",87699));
        System.out.println("Employess with Salary > 50000");
        employess.stream()
                .filter(emp->emp.salary>50000)
                .forEach(emp->System.out.println(emp.id+" "+ emp.name+" "+ emp.salary));
    }
}
