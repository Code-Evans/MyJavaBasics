package Java_OOP;

// Abstraction in Java

/**
 * Abstraction is the process of hiding complex implementation details
 * and showing only the essential features to the user.
 * 
 * In Java, abstraction can be achieved in two ways:
 * 
 * 1. Abstract Classes (0–100% abstraction)
 *    - Declared with the 'abstract' keyword.
 *    - Can have both abstract methods (no body) and concrete methods.
 *    - Cannot be instantiated directly.
 * 
 * 2. Interfaces (100% abstraction)
 *    - Declared with the 'interface' keyword.
 *    - All methods are abstract by default (until Java 8, which added default/static methods).
 *    - A class implements an interface to provide its behavior.
 */

 public class AbstractionExample {
    public static void main(String[] args) {

        // --- Abstract Class Example ---
        System.out.println("Abstract Class Example:");
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myDog.eat();
        myCat.makeSound();

        // --- Interface Example ---
        System.out.println("\nInterface Example:");
        Vehicle car = new Car();
        Vehicle bike = new Motorcycle();
        car.start();
        bike.start();
        car.stop();
        bike.stop();
    }
}

// Example 1: Abstract Class
abstract class Animal {
    // Abstract method (no body) — must be implemented by subclasses
    abstract void makeSound();

    // Concrete method — can be used by all subclasses
    void eat() {
        System.out.println("This animal is eating...");
    }
}

// Subclasses provide specific implementations
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows!");
    }
}

// Example 2: Interface
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }
}

