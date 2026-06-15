import java.util.ArrayList;
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Id:"+id+"Name:"+name+"Salary:"+salary);
    }

}



public class Task10 {
    public static void main(String[] args){
        ArrayList<Employee> emplist= new ArrayList<>();
        emplist.add(new Employee(101,"Saloni",456777));
        emplist.add(new Employee(102,"Suhuh",4567696));
        emplist.add(new Employee(103,"hsudhus",456777));
        emplist.add(new Employee(104,"sjwyuw",456777));

        System.out.println("Employee Details:");
        for(Employee emp: emplist){
            emp.display();
        }
        int searchId=102;
        System.out.println("\nSearching Employee with id"+ searchId);
        for(Employee emp:emplist){
            if(emp.id==searchId){
                emp.display();
            }
        }
        int removeId=103;
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i).id==removeId){
                emplist.remove(i);
                break;
            }
        }
        System.out.println("\nEmployee list after removal:");
            for(Employee emp: emplist){
                emp.display();
        }
    }
}
