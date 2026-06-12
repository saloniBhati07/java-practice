class Calculator{
    int add(int a, int b){
        return a+b;

    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}




public class Task5 {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(2,3));
        System.out.println(cal.add(30,40,50));
    }
}
