import java.util.*;
public class Task1 {
    public static void main(String[] args) {
       //variable:memory location to store values
        int age = 21;
        System.out.println(age);
        //datatype:primitive and non-primitive
        //primitive:stores actual values; non-primitive stores memory address
        double price =9874.50;
        System.out.println(price);
        String city="Hyd";
        System.out.println(city);
        //operators
        int a=20;
        int b=80;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //relational operators
        System.out.println(a>b);
        System.out.println(a==b);
        //logical operators
        boolean c=true;
        boolean d= false;
        System.out.println(c||d);
        System.out.println(c&&d);
        System.out.println(!c);
        //Assignment operators
        int x=10;
        x+=6;
        System.out.println(x);
        //increment and decrement operator
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name= sc.nextLine();
        System.out.println("Name="+name);

        //typecasting
        //implicit:wide
      int number=50;
      double value = number;
      System.out.println(value);
//explicit:narrow
      double sprice=99.99;
      int p=(int) sprice;
      System.out.println(p);

    }
}
