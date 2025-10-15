// Enhanced Switch Statements in Java

/**
 * Enhanced switch statements (Java 14 and later)
 * make code more concise and readable.
 * 
 * Key Features:
 * - Arrow syntax (->) replaces traditional case + break.
 * - Switch can return a value (called a "switch expression").
 * - Multiple case labels can share the same action.
 * - No need for 'break' — each case ends automatically.
 */

public class EnhancedSwitchStatement {
    public static void main(String[] args) {

        int day = 3;

        // Example 1: Simple enhanced switch
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend!");
            default -> System.out.println("Invalid day");
        }

        // Example 2: Switch as an expression (returns a value)
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("Day type: " + dayType);

        // Example 3: Switch expression with block and yield
        int month = 2;
        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean isLeapYear = true;
                yield (isLeapYear) ? 29 : 28;
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        System.out.println("Days in month: " + daysInMonth);
    }
}
