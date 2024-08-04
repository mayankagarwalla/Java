import java.util.Scanner;
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add two strings (concatenation)
    public String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add two integers");
            System.out.println("2. Add three integers");
            System.out.println("3. Add two double values");
            System.out.println("4. Concatenate two strings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter first integer: ");
                    int int1 = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int int2 = scanner.nextInt();
                    System.out.println("Result: " + calculator.add(int1, int2));
                    break;

                case 2:
                    System.out.print("Enter first integer: ");
                    int int3 = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int int4 = scanner.nextInt();
                    System.out.print("Enter third integer: ");
                    int int5 = scanner.nextInt();
                    System.out.println("Result: " + calculator.add(int3, int4, int5));
                    break;

                case 3:
                    System.out.print("Enter first double: ");
                    double double1 = scanner.nextDouble();
                    System.out.print("Enter second double: ");
                    double double2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(double1, double2));
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Result: " + calculator.add(str1, str2));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
