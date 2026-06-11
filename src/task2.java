import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        //addition calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
                int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is: " + sum);

    }
}
