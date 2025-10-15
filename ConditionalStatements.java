// Conditional Statements in Java

/**
 * Conditional statements are used to make decisions in Java.
 * They allow your program to execute certain code blocks
 * depending on whether a condition is true or false.
 * 
 * Common conditional statements:
 * - if
 * - if...else
 * - else if
 * - switch
 */

public class ConditionalStatements {
    public static void main(String[] args) {

        int number = 10;

        // Simple if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if...else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if...else if...else statement
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

        // Nested if statement
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Please show your ID.");
            }
        } else {
            System.out.println("Access denied. You must be 18 or older.");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend!");
                break;
        }

        // Ternary operator (short if-else)
        String result = (number > 0) ? "Positive" : "Non-positive";
        System.out.println("The number is: " + result);
    }
}
