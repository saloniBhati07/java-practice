import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //area of circle
        System.out.print("Enter the radius: ");
        double radius= sc.nextDouble();
        double area = 3.14 * radius *radius;
        System.out.print("Area is: " + area);
    }
}
