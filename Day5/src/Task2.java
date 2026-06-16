public class Task2 {
    public static void main(String[] args){
        try{
            int arr[] = new int[5];
            arr[6]=10;
            int result=10/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error");
        }catch(ArithmeticException e){
            System.out.print("Arithmetic error");
        }
    }
}
