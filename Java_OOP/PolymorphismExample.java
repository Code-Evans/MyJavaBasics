package Java_OOP;

// Polymorphism in Java

/**
 * Polymorphism means "many forms".
 * It allows one interface (or method name) to behave differently
 * depending on the object that is calling it.
 * 
 * There are two main types:
 * 
 * 1. Compile-time Polymorphism (Method Overloading)
 *    - Same method name, different parameters.
 *    - Decided at compile time.
 * 
 * 2. Runtime Polymorphism (Method Overriding)
 *    - Same method name, same parameters, different class.
 *    - Decided at runtime based on the actual object type.
 */

 // Example 1: Compile-time Polymorphism (Method Overloading)
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Example 2: Runtime Polymorphism (Method Overriding)
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        // --- Compile-time Polymorphism ---
        System.out.println("Compile-time Polymorphism:");
        MathOperation math = new MathOperation();
        System.out.println("add(int, int): " + math.add(2, 3));
        System.out.println("add(double, double): " + math.add(2.5, 3.7));
        System.out.println("add(int, int, int): " + math.add(1, 2, 3));

        // --- Runtime Polymorphism ---
        System.out.println("\nRuntime Polymorphism:");
        Animal myAnimal;

        myAnimal = new Dog();  // Reference type = Animal, Object type = Dog
        myAnimal.makeSound();  // Calls Dog's version

        myAnimal = new Cat();  // Reference type = Animal, Object type = Cat
        myAnimal.makeSound();  // Calls Cat's version

        // --- Array of Objects Example ---
        System.out.println("\nPolymorphism with Array:");
        Animal[] animals = { new Dog(), new Cat(), new Animal() };
        for (Animal a : animals) {
            a.makeSound(); // Each object responds differently
        }
    }
}

