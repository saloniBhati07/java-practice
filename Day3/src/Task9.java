class Personn{
    private String name;
    Personn(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
}
class Employ extends Personn{
    private int id;
    private double salary;
    Employ(String name, int id, double salary){
        super(name);
        this.id=id;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    void displayDetails(){
        System.out.println("EmployeeDetails");
        System.out.println("Name:"+ getName());
        System.out.println("id:"+ getId());
        System.out.println("salary:"+ getSalary());
    }
}



public class Task9 {
    public static void main(String[] args){
        Employ e = new Employ("saloni", 122,3000000);
        e.displayDetails();

    }
}
