package Programming_Challenges;

// Step 1: Define the class
// The purpose of this class is to check if three numbers share the same last digit.
public class LastDigitChecker {

    // Step 2: Define a method to check if any of the three numbers have the same last digit.
    // The method returns 'true' if at least two numbers share the same last digit AND all numbers are valid.
    public boolean hasSameLastDigit (int par1, int par2, int par3) {
        
        // Step 3: Identify the input and extract the key data (the last digits)
        // We use the modulus operator (%) to get the remainder when divided by 10 — the last digit.
        int lastDigit1 = par1 % 10;
        int lastDigit2 = par2 % 10;
        int lastDigit3 = par3 % 10;
        
        // Step 4: Apply the conditional logic
        // First, check if any two last digits are the same.
        if (lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3) {
            
            // Step 5: Check validity of each input number
            // All parameters must be between 10 and 1000.
            if (isValid(par1) && isValid(par2) && isValid(par3)) {
                return true; // All numbers valid and at least two share the same last digit.
            } else {
                return false; // At least one number is invalid.
            }
            
        } else {
            // Step 6: If none of the last digits match, return false immediately.
            return false;
        }
    }
    
    // Step 7: Helper method to validate the range of a number.
    // This supports the main logic by keeping the validation separate (cleaner and reusable).
    public boolean isValid (int par1) {
        
        // Step 8: Check if the number is within the valid range [10, 1000].
        if (par1 >= 10 && par1 <= 1000) {
            return true;  // Valid number
        } else {
            return false; // Invalid number
        }
    }

    // Step 9: Main method — program entry point
    public static void main(String[] args) {

        // Step 10: Create an instance of the class (since methods are non-static)
        LastDigitChecker checker = new LastDigitChecker();

        // Step 11: Test the method with different inputs

        // Case 1: All valid and share the same last digit (e.g., 27, 57, 107 → last digit 7)
        System.out.println("Case 1: " + checker.hasSameLastDigit(27, 57, 107)); // Expected: true

        // Case 2: Valid numbers but different last digits
        System.out.println("Case 2: " + checker.hasSameLastDigit(12, 23, 34)); // Expected: false

        // Case 3: One invalid number (less than 10)
        System.out.println("Case 3: " + checker.hasSameLastDigit(5, 25, 35)); // Expected: false

        // Case 4: Two numbers share same last digit (99, 9 is invalid though)
        System.out.println("Case 4: " + checker.hasSameLastDigit(99, 19, 109)); // Expected: true

        // Case 5: Edge case testing upper bound (1000)
        System.out.println("Case 5: " + checker.hasSameLastDigit(1000, 20, 90)); // Expected: false
    }
}
