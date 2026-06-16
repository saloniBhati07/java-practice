public class Task3 {
    public static void main(String[] args){
        try{
            int data=10/2;
            System.out.println(data);

        }catch(Exception e){
            System.out.println("Error");
        }finally{
            System.out.println("Finally block executed");
        }
    }
}
