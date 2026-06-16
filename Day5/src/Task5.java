class test{
    static void check() throws ArithmeticException{
        int num=10/0;
    }
    public static void main(String[] args){
        try{
            check();
        }catch(Exception e){
            System.out.println("Handeled exception");
        }
    }
}


public class Task5 {
}
