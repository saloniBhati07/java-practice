import java.util.regex.*;
public class Task7 {
    public static void main(String[] args){
        String email = "test@gmail.com";
        boolean isValid= Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
        System.out.println("Valid:"+isValid);
    }
}
