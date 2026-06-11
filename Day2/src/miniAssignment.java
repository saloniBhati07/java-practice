import java.util.Scanner;
public class miniAssignment {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name= sc.nextLine();
            System.out.print("Enter marks: ");
            int marks= sc.nextInt();
           if(marks>=35){
               if(marks>=75){
                   System.out.print("Distinction");
               }
               else{
                   System.out.print("pass");
               }

        }
           else System.out.print("Fail");
    }
}
