// Arrays in Java

/**
 * Arrays are used to store multiple values of the same data type
 * in a single variable.
 * 
 * - Arrays have a fixed size once created.
 * - Each element is accessed using an index (starting from 0).
 * - Arrays can store primitive types or objects.
 * 
 * Common types:
 * 1. Single-dimensional arrays
 * 2. Multi-dimensional arrays (e.g., 2D arrays)
 * 3. Enhanced for loop for easy traversal
 */

public class ArrayExample {
    public static void main(String[] args) {

        // --- SINGLE-DIMENSIONAL ARRAY ---
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Single-Dimensional Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // --- MODIFYING ARRAY ELEMENTS ---
        numbers[2] = 99; // Change value at index 2
        System.out.println("\nAfter modification:");
        for (int num : numbers) { // Enhanced for loop
            System.out.println(num);
        }

        // --- STRING ARRAY ---
        String[] fruits = new String[3]; // Declares array of 3 elements
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println("\nString Array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // --- MULTI-DIMENSIONAL ARRAY (2D ARRAY) ---
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println("\nTwo-Dimensional Array (Matrix):");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // --- ARRAY UTILITY METHODS (java.util.Arrays) ---
        System.out.println("\nUsing Arrays Utility Class:");
        java.util.Arrays.sort(numbers); // Sorts array in ascending order
        System.out.println("Sorted numbers: " + java.util.Arrays.toString(numbers));

        int index = java.util.Arrays.binarySearch(numbers, 99);
        System.out.println("Index of 99: " + index);
    }
}
