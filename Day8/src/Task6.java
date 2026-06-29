public class Task6 {
    public static void main(String[] args) {

        String str = " Java Programming ";

        System.out.println("Length: " + str.length());
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());
        System.out.println("Char At: " + str.charAt(2));
        System.out.println("Substring: " + str.substring(6));
        System.out.println("Contains Java: " + str.contains("Java"));
        System.out.println("Replace: " + str.replace("Java", "Python"));
        System.out.println("Trim: " + str.trim());

        String s1 = "Java";
        String s2 = "JAVA";

        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        System.out.println("\n----- StringBuilder -----");

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(4, " Language");
        System.out.println(sb);

        sb.delete(4, 13);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println("\n----- Regex -----");

        String email = "saloni@gmail.com";

        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");

        String password = "Java1234";

        if (password.matches("^(?=.[A-Z])(?=.\\d).{8,}$"))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
