public class Task3 {
    public static void main(String[] args){
        String s1 = "java Programming";
        System.out.println("Substring from index 5:"+ s1.substring(5));
        System.out.println("Substring from index 0 to 4:"+ s1.substring(0,4));

        System.out.println("Contains 'java':"+s1.contains("java"));
        System.out.println("Conatins 'Python':"+ s1.contains("Python"));


        System.out.println("After replacing 'java' with 'python':" + s1.replace("java", "python"));
    }
}
