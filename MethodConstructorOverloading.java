class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with one parameter (square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters (rectangle)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Overloaded method to calculate area with different dimensions
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Overloaded method to calculate perimeter with different dimensions
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class MethodConstructorOverloading {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1 (default):");
        System.out.println("Length: " + rectangle1.getLength() + ", Width: " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());

        // Using constructor with one parameter
        Rectangle rectangle2 = new Rectangle(5);
        System.out.println("\nRectangle2 (square):");
        System.out.println("Length: " + rectangle2.getLength() + ", Width: " + rectangle2.getWidth());
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        // Using constructor with two parameters
        Rectangle rectangle3 = new Rectangle(4, 6);
        System.out.println("\nRectangle3:");
        System.out.println("Length: " + rectangle3.getLength() + ", Width: " + rectangle3.getWidth());
        System.out.println("Area: " + rectangle3.calculateArea());
        System.out.println("Perimeter: " + rectangle3.calculatePerimeter());

        // Using overloaded methods with different dimensions
        double area = rectangle3.calculateArea(7, 8);
        double perimeter = rectangle3.calculatePerimeter(7, 8);
        System.out.println("\nUsing overloaded methods with dimensions 7 and 8:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
