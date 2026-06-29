import java.io.*;
public class Task8 {
    public static void main(String[] args) {

        try {

            // File Creation
            File file = new File("employee.txt");

            if (file.createNewFile())
                System.out.println("File Created");
            else
                System.out.println("File Already Exists");

            // File Writing
            FileWriter writer = new FileWriter(file);

            writer.write("101 Saloni 50000\n");
            writer.write("102 Rahul 60000\n");
            writer.write("103 Priya 75000\n");

            writer.close();

            System.out.println("Employee Records Stored Successfully\n");

            // File Reading using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("Employee Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
