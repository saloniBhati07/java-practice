import java.util.Scanner;

public class Task2 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       //even-odd
       System.out.println("--Even/Odd---");
       System.out.print("Enter a number:");
       int num= sc.nextInt();
       if (num % 2 == 0) {

           System.out.println(num+ " is Even");
       }
       else{
           System.out.println(num+ " is odd");
       }
       //prime-number
       int prime=num;
       boolean Isprime=true;
       if(prime<=1){
          Isprime=false;
       }
       else{
           for(int i=2;i<=Math.sqrt(prime);i++){
               if(prime%i==0){
                   Isprime=false;
break;
               }
           }
       }
       if(Isprime)System.out.println("Is prime");
       else System.out.println("Is not a prime");


//factorial
       int number= num;
       int fact=1;
       for(int i=1;i<=number;i++){
           fact*=i;
       }
       System.out.println("Factorial:"+fact);
       //fibonacci
       System.out.println("Enter number of terms");
       int n=sc.nextInt();
       int a=0;
       int b=1;
       for(int i=1;i<=n;i++){
           System.out.print(a+" ");
           int c=a+b;
           a=b;
           b=c;
       }
       //multiplication table
       for(int i=1;i<=10;i++) {
           System.out.println(n +"x"+i+"="+(n*i));
       }
   }
}
