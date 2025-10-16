// Inheritance in Java

/**
 * Inheritance allows one class (child/subclass) to inherit
 * the fields and methods of another class (parent/superclass).
 * 
 * It promotes code reusability and establishes an "is-a" relationship.
 * 
 * Syntax: 
 * class SubclassName extends SuperclassName { ... }
 * 
 * Types of Inheritance in Java:
 *  - Single Inheritance (one class inherits from another)
 *  - Multilevel Inheritance (a class inherits from another derived class)
 *  - Hierarchical Inheritance (multiple classes inherit from one parent)
 * 
 * Note: 
 *  - Java does NOT support multiple inheritance with classes 
 *    (to avoid ambiguity), but it can be achieved using interfaces.
 */

// Example 1: Single Inheritance
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    int wheels = 4;

    void drive() {
        System.out.println("Car is driving...");
    }
}

// Example 2: Multilevel Inheritance
class ElectricCar extends Car {
    int batteryCapacity = 85;

    void charge() {
        System.out.println("Electric car is charging...");
    }
}

// Example 3: Hierarchical Inheritance
class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        // --- Single Inheritance ---
        System.out.println("Single Inheritance Example:");
        Car myCar = new Car();
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Wheels: " + myCar.wheels);
        myCar.start();  // inherited from Vehicle
        myCar.drive();

        // --- Multilevel Inheritance ---
        System.out.println("\nMultilevel Inheritance Example:");
        ElectricCar myTesla = new ElectricCar();
        System.out.println("Brand: " + myTesla.brand);
        System.out.println("Battery Capacity: " + myTesla.batteryCapacity + " kWh");
        myTesla.start();  // from Vehicle
        myTesla.drive();  // from Car
        myTesla.charge(); // from ElectricCar

        // --- Hierarchical Inheritance ---
        System.out.println("\nHierarchical Inheritance Example:");
        Motorcycle myBike = new Motorcycle();
        System.out.println("Brand: " + myBike.brand);
        myBike.start();
        myBike.ride();
    }
}
