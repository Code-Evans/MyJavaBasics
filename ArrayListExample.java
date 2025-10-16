// ArrayList in Java

/**
 * The ArrayList is part of Java's Collections Framework (java.util package).
 * Unlike regular arrays, ArrayLists are *dynamic* — they can grow or shrink in size.
 * 
 * Key Features:
 * - Stores elements of the same type (like arrays)
 * - Automatically resizes when you add/remove elements
 * - Allows random access by index
 * - Provides many built-in methods for easy manipulation
 * 
 * Syntax:
 * ArrayList<Type> name = new ArrayList<>();
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    // Commonly used ArrayList methods:
        // add(element) — Adds an element to the list
        // add(index, element) — Inserts an element at a specific position
        // get(index) — Returns the element at the specified index
        // set(index, element) — Replaces the element at a specific index
        // remove(index) — Removes the element at a specified index
        // remove(Object) — Removes the first occurrence of the specified element
        // size() — Returns the number of elements in the list
        // contains(Object) — Checks if the list contains the specified element
        // isEmpty() — Checks if the list is empty
        // clear() — Removes all elements from the list
        // indexOf(Object) — Returns the index of the first occurrence, or -1 if not found
        
    public static void main(String[] args) {

        // Step 1: Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Step 2: Add elements using add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Initial ArrayList:");
        System.out.println(fruits);

        // Step 3: Access elements using get()
        System.out.println("\nFirst fruit: " + fruits.get(0));

        // Step 4: Modify an element using set()
        fruits.set(1, "Blueberry");
        System.out.println("\nAfter modifying element at index 1:");
        System.out.println(fruits);

        // Step 5: Remove an element using remove()
        fruits.remove("Apple");
        System.out.println("\nAfter removing 'Apple':");
        System.out.println(fruits);

        // Step 6: Loop through ArrayList
        System.out.println("\nList of fruits using for-each loop:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Step 7: Get size of ArrayList
        System.out.println("\nTotal fruits: " + fruits.size());

        // Step 8: Using user input with ArrayList
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("\nHow many numbers do you want to enter? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        System.out.println("\nNumbers you entered: " + numbers);

        // Step 9: Example of sum using ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}
