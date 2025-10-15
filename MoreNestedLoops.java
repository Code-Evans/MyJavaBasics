// ForNestedPatterns.java

public class MoreNestedLoops {

    public static void main(String[] args) {

        // 1) Simple for loop: prints numbers 1..5
        System.out.println("Simple for loop (1..5):");
        for (int i = 1; i <= 5; i++) {        // LINE A
            System.out.println("i = " + i);   // LINE B
        }
        System.out.println(); // blank line for readability

        // 2) Nested for loop: prints a 4x4 square of stars
        System.out.println("4x4 square pattern:");
        int size = 4;                          // LINE C
        for (int row = 1; row <= size; row++) {        // LINE D (outer loop)
            for (int col = 1; col <= size; col++) {    // LINE E (inner loop)
                System.out.print("* ");                // LINE F
            }
            System.out.println(); // after each row, move to next line (LINE G)
        }
        System.out.println();

        // 3) Nested for loops used to build a right-angled triangle (pattern)
        System.out.println("Right-angled triangle pattern (rows = 4):");
        int rows = 4;                          // LINE H
        for (int r = 1; r <= rows; r++) {      // LINE I (outer loop: controls current row)
            for (int c = 1; c <= r; c++) {     // LINE J (inner loop: number of stars in this row)
                System.out.print("* ");        // LINE K
            }
            System.out.println();              // LINE L: end of the current row
        }

        // 4) Nested for loops used to build a Reversed right-angled triangle (pattern)
        System.out.println("Reversed Right-angled triangle pattern (rows = 4):");
        int reverse = 4;                          // LINE H
        for (int r = reverse; r >= 1; r--) {      // LINE I (outer loop: starts at 4 down to 1)
            for (int c = 1; c <= r; c++) {     // LINE J (inner loop: number of stars in this row)
                System.out.print("* ");        // LINE K
            }
            System.out.println();              // LINE L: end of the current row
        }
    }
}
