import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String string){
        super(string);
    }
}


public class UserException{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = scanner.nextInt();

        try {
            if (age < 18 || age > 60) {
                throw new InvalidAgeException("Invalid Age!..Age must be between 18 and 60");
            }
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}