import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        int max=a;
        if(b>a && b>c){
            max= b;
            System.out.println("Largest number is:"+ max);
        }
        else if(c>a && c>b){
            max=c;
            System.out.println("Largest number is:"+max);
        }
        else
        System.out.println("Largest number is:"+max);
    }
}

