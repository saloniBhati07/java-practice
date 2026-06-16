import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter employee salary:");
            double salary= sc.nextDouble();
            if(salary<0){
                throw new Exception("Salary cannot be negative");
            }
            System.out.println("valid Salary:"+salary);
        }catch(Exception e){
            System.out.println("invalid input:" + e.getMessage());

        }
        sc.close();
    }
}
