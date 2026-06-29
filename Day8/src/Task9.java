import java.util.*;
public class Task9 {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("1. Find Second Largest Number");
            System.out.println("2. Check Palindrome String");
            System.out.println("3. Count Vowels");
            System.out.println("4. Reverse a Number");
            System.out.println("5. Find Duplicate Elements");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Program 1
                case 1:
                    int[] arr = {10, 25, 45, 30, 50, 40};

                    int largest = arr[0];
                    int secondLargest = arr[0];

                    for (int i = 1; i < arr.length; i++) {

                        if (arr[i] > largest) {
                            secondLargest = largest;
                            largest = arr[i];
                        } else if (arr[i] > secondLargest && arr[i] != largest) {
                            secondLargest = arr[i];
                        }
                    }

                    System.out.println("Second Largest Number: " + secondLargest);
                    break;

                // Program 2
                case 2:
                    System.out.print("Enter String: ");
                    String str = sc.nextLine();

                    String rev = "";

                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }

                    if (str.equalsIgnoreCase(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");

                    break;

                // Program 3
                case 3:
                    System.out.print("Enter String: ");
                    String s = sc.nextLine().toLowerCase();

                    int count = 0;

                    for (int i = 0; i < s.length(); i++) {

                        char ch = s.charAt(i);

                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                            count++;
                    }

                    System.out.println("Vowels Count: " + count);
                    break;

                // Program 4
                case 4:
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();

                    int reverse = 0;

                    while (num != 0) {

                        int digit = num % 10;
                        reverse = reverse * 10 + digit;
                        num = num / 10;
                    }

                    System.out.println("Reversed Number: " + reverse);
                    break;

                // Program 5
                case 5:
                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(10);
                    list.add(20);
                    list.add(30);
                    list.add(20);
                    list.add(40);
                    list.add(10);

                    HashSet<Integer> unique = new HashSet<>();
                    HashSet<Integer> duplicate = new HashSet<>();

                    for (int n : list) {

                        if (!unique.add(n)) {
                            duplicate.add(n);
                        }
                    }

                    System.out.println("Original List: " + list);
                    System.out.println("Duplicate Elements: " + duplicate);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            sc.close();
        }
    }
