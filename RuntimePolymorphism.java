class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Creating objects of subclasses using superclass reference
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the overridden methods
        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow

        // Demonstrating polymorphism with an array
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
