class FinalExample {
    // final variable
    final int finalVariable = 10;

    // final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

// final class
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

class FinallyExample {
    public void show() {
        try {
            System.out.println("Inside try block.");
            // Code that might throw an exception
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}

class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called.");
    }
}

public class FFF {
    public static void main(String[] args) {
        // Demonstrate final keyword
        FinalExample finalExample = new FinalExample();
        System.out.println("Final variable value: " + finalExample.finalVariable);
        finalExample.finalMethod();

        // Demonstrate final class
        FinalClass finalClass = new FinalClass();
        finalClass.display();

        // Demonstrate finally block
        FinallyExample finallyExample = new FinallyExample();
        finallyExample.show();

        // Demonstrate finalize method
        FinalizeExample finalizeExample = new FinalizeExample();
        finalizeExample = null;

        // Suggesting JVM for garbage collection
        System.gc();

        // Adding a small delay to ensure garbage collection happens before the program ends
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
