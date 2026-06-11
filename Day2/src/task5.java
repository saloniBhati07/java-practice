import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number= sc.nextInt();
        int reverse=0;
        while(number!=0){
            int digit =number%10;
            reverse = reverse*10+digit;
            number/=10;
        }
        System.out.print("revrsed number: " + reverse);

    }
}