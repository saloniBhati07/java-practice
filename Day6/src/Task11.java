import java.util.Scanner;
public class Task11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter email:");
        String email= sc.nextLine();
        System.out.println("Enter Password:");
        String password= sc.nextLine();
        String emailRegix="^[A-Za-z0-9]+_.=]+@[A-Za-z0-9.-]+$";
        String passwordRegix= "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        if(name.trim().isEmpty()){
            System.out.println("Invalid Name");
        }
        else if(!email.matches(emailRegix)) {
            System.out.println("Invalid email");
        } else if(!password.matches(passwordRegix)){
                System.out.println("Invalid password");

            }else{
            System.out.println("Registration Successfull");

        }
        sc.close();
    }
}
