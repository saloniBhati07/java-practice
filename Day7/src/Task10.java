import java.util.*;
import java.util.stream.Collectors;
class Employee{
    int id;
    String name;
    String department;
    double salary;
    Employee(int id, String name,double salary, String department){
        this.id= id;
        this.name=name;
        this.salary=salary;
        this.department=department;


    }

    @Override
    public String toString() {
        return id+ " "+ name +" "+ department+" "+ salary;
    }
}
public class Task10 {
    public static void main(String[] args){
        List<Employee> employess = Arrays.asList(
                new Employee(12,"Ajay",34786,"IT"),
                new Employee(13,"Saloni",785649,"Finance"),
                new Employee(14,"Priya",67383,"HR"),
                new Employee(15,"Ravi",87352,"IT"),
                new Employee(16,"Neha", 537282,"HR")
        );
        System.out.println("IT Employees:");
        employess.stream()
                .filter(emp->emp.department.equals("IT"))
                .forEach(System.out::println);

        System.out.println("\nSalary>5000:");
        employess.stream()
                .filter(emp -> emp.salary >50000)
        .forEach(System.out::println);

        System.out.println("\nSorted by name:");
        employess.stream()
                .sorted(Comparator.comparing(emp->emp.name))
                .forEach(System.out::println);

        System.out.println("\nCount by Department:");
        Map<String, Long> count=
                employess.stream()
                .collect(Collectors.groupingBy(
                        emp-> emp.department,
                        Collectors.counting()));
System.out.println(count);

    }
}
