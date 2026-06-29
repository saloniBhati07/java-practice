import java.util.Scanner;

class invalidAgeException extends Exception{
    invalidAgeException(String message){
        super(message);
    }
}
public class Task5 {
    static void checkAge(int age) throws invalidAgeException{
        if(age<18){
            throw new invalidAgeException("Employee age must be 18 or above");

        }
        System.out.println("Employee Eligible for onboarding ");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Age:");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }catch (invalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
