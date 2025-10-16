package Java_OOP;

// Encapsulation in Java

/**
 * Encapsulation is one of the four main pillars of Object-Oriented Programming (OOP).
 * It means "wrapping data (fields) and methods (functions) into a single unit (class)" 
 * and restricting direct access to the data.
 * 
 * In simpler terms:
 * - Make class fields PRIVATE
 * - Provide PUBLIC getter and setter methods for controlled access
 * 
 * Benefits of Encapsulation:
 * - Protects data from unintended modification
 * - Allows validation and control over how data is changed
 * - Increases code maintainability and flexibility
 */

public class EncapsulationExample {
    public static void main(String[] args) {

        // Create an Employee object
        Employee emp = new Employee();

        // Setting values using setters
        emp.setName("Adrian Evangelista");
        emp.setPosition("Cloud Engineer");
        emp.setSalary(80000);

        // Getting values using getters
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: ₱" + emp.getSalary());

        // Trying to set invalid data (triggers validation)
        emp.setSalary(-5000); // Will print validation message
    }
}

// --- Encapsulated Employee Class ---
class Employee {

    // Private fields: hidden from direct access
    private String name;
    private String position;
    private double salary;

    // Public getters: used to read private data
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Public setters: used to modify private data safely
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary cannot be negative.");
        }
    }
}
