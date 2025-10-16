// Inserting User Input into an Array in Java

/**
 * You can use the Scanner class to take user input
 * and store those values inside an array.
 * 
 * Steps:
 * 1. Import java.util.Scanner
 * 2. Create a Scanner object for input
 * 3. Ask the user for array size
 * 4. Loop through and fill the array with values
 * 5. Display the array elements
 */

import java.util.Scanner;

public class UserInputArrayExample {
    public static void main(String[] args) {

        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Step 3: Declare an array with the given size
        int[] numbers = new int[size];

        // Step 4: Get user inputs
        System.out.println("\nEnter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 5: Display the array
        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Step 6: Optional — find sum or average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / size;

        System.out.println("\n\nSum: " + sum);
        System.out.println("Average: " + average);

        // Step 7: Close scanner to prevent resource leaks
        scanner.close();
    }
}
