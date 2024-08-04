import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Strings");
            System.out.println("2. Find Length of Strings");
            System.out.println("3. Concatenate Strings");
            System.out.println("4. Compare Strings (Case-sensitive)");
            System.out.println("5. Compare Strings (Case-insensitive)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first string: ");
                    str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = scanner.nextLine();
                    break;

                case 2:
                    System.out.println("Length of first string: " + str1.length());
                    System.out.println("Length of second string: " + str2.length());
                    break;

                case 3:
                    String concatenatedString = str1 + " " + str2;
                    System.out.println("Concatenated String: " + concatenatedString);
                    String concatenatedString2 = str1.concat(" ").concat(str2);
                    System.out.println("Concatenated String using concat method: " + concatenatedString2);
                    break;

                case 4:
                    boolean isEqual = str1.equals(str2);
                    System.out.println("str1 equals str2: " + isEqual);
                    int comparisonResult = str1.compareTo(str2);
                    System.out.println("str1 compareTo str2: " + comparisonResult);
                    break;

                case 5:
                    boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
                    System.out.println("str1 equalsIgnoreCase str2: " + isEqualIgnoreCase);
                    int comparisonResultIgnoreCase = str1.compareToIgnoreCase(str2);
                    System.out.println("str1 compareToIgnoreCase str2: " + comparisonResultIgnoreCase);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 6);

        scanner.close();
    }
}
