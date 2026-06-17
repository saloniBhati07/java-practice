public class Task2 {
    public static void main(String[] args){
        String s1="Hellooo";
        String s2= "Hellooo";
        String s3= "hellooo";
        if(s1.equals(s2)) System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");

        if(s1.equalsIgnoreCase(s3))System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
    }
}
