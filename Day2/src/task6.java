import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        int rev=0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        if(rev==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}