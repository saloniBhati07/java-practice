
    class Employee{
        int id;
        String name;
        Employee(int id, String name){
            this.id=id;
            this.name=name;
        }
        void display() {
          System.out.println("Id: "+id);
          System.out.println("Name:"+name);
        }
    }
    class Manager extends Employee {
        String department;

        Manager(int id, String name, String department) {
            super(id, name);
            this.department = department;
        }

        void ShowDepartment() {
            System.out.println("Department:" + department);
        }
    }
        public class Task3 {
            public static void main(String[] args){
                Manager m= new  Manager(101, "Saloni", "IT");
                m.display();
                m.ShowDepartment();
            }
        }