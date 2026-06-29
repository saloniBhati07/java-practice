import java.util.*;
import java.io.*;

class Employees {

    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employees> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Save to File");
            System.out.println("6. Read from File");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        if (salary < 0) {
                            throw new Exception("Salary cannot be negative.");
                        }

                        employees.add(new Employees(id, name, salary));
                        System.out.println("Employee Added Successfully.");

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        sc.nextLine();
                    }
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No Employee Records.");
                    } else {
                        for (Employees emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Employees emp : employees) {
                        if (emp.getId() == searchId) {
                            System.out.println(emp);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int removeId = sc.nextInt();

                    Iterator<Employees> it = employees.iterator();
                    boolean removed = false;

                    while (it.hasNext()) {
                        Employees emp = it.next();

                        if (emp.getId() == removeId) {
                            it.remove();
                            removed = true;
                            break;
                        }
                    }

                    if (removed)
                        System.out.println("Employee Removed.");
                    else
                        System.out.println("Employee Not Found.");

                    break;

                case 5:
                    try {
                        FileWriter writer = new FileWriter("employee.txt");

                        for (Employees emp : employees) {
                            writer.write(emp.toString() + "\n");
                        }

                        writer.close();
                        System.out.println("Employee Records Saved Successfully.");

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("employee.txt"));

                        String line;

                        System.out.println("\nEmployee Records:");

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }

                        br.close();

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("Application Closed.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}