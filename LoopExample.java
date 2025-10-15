// Loops in Java

/**
 * Loops are used to execute a block of code repeatedly
 * as long as a specified condition is true.
 * 
 * Common loop types:
 * - for loop
 * - while loop
 * - do...while loop
 * - enhanced for loop (for-each)
 */

public class LoopExample {
    public static void main(String[] args) {

        // FOR LOOP
        // Used when you know exactly how many times to loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // WHILE LOOP
        // Repeats while the condition is true
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // DO-WHILE LOOP
        // Executes the block at least once, even if condition is false
        System.out.println("\nDo-While Loop:");
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 5);

        // ENHANCED FOR LOOP (For-Each)
        // Best for iterating through arrays or collections
        System.out.println("\nEnhanced For Loop:");
        String[] fruits = { "Apple", "Banana", "Cherry" };
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // NESTED LOOP
        // Loop inside another loop (useful for patterns or 2D arrays)
        System.out.println("\nNested Loop (Pattern Example):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}
