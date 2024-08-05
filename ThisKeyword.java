class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.age = age;   // 'this.age' refers to the instance variable, 'age' refers to the parameter
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + this.name); // 'this.name' refers to the instance variable
        System.out.println("Age: " + this.age);   // 'this.age' refers to the instance variable
    }

    // Method to compare ages of two persons
    public void compareAge(Person other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older than " + other.name);
        } else if (this.age < other.age) {
            System.out.println(this.name + " is younger than " + other.name);
        } else {
            System.out.println(this.name + " and " + other.name + " are of the same age");
        }
    }

    // Method to return the current object
    public Person getSelf() {
        return this; // Returns the current object
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        person1.displayDetails(); // Displays details of person1
        person2.displayDetails(); // Displays details of person2

        person1.compareAge(person2); // Compares ages of person1 and person2

        // Using 'this' to return the current object
        Person self = person1.getSelf();
        System.out.println("Self: " + self); // Should print Alice's details
    }
}
