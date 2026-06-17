import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password:");
        String password= sc.nextLine();
        String regex ="^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        if(password.matches(regex)){
            System.out.println("valid Password");

        }else{
            System.out.println("Invalid Password");
        }
        sc.close();
    }
}
