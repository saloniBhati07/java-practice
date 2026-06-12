class Employe {
        int id;
        String name;
        void display(){
            System.out.println(id+ " "+ name);
        }
    }
    public class Task1{
    public static void main(String[] args){
        Employe emp = new Employe();
        emp.id=101;
        emp.name="Saloni";
        emp.display();

    }
}
