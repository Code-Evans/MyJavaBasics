package Programming_Challenges;

// Step 1: Define the class
// This class is designed to check whether a given number is positive, negative, or zero.
public class PositiveNegativeZero {
    
    // Step 2: Define a method that performs the check
    // This method accepts one input: an integer number.
    public void checkNumber(int number ){
        
        // Step 3: Apply conditional logic
        // If the number is greater than 0, it’s positive.
        if (number > 0) 
            System.out.print("positive");
        
        // If the number is less than 0, it’s negative.
        else if (number < 0)
            System.out.print("negative");
        
        // If the number equals 0, print zero.
        else if (number == 0)
            System.out.print("zero");
        
    }

    // Step 4: The main method — program entry point
    public static void main(String[] args) {

        // Step 5: Create an object of the class
        // Since checkNumber() is not static, we need an instance of the class to call it.
        PositiveNegativeZero check = new PositiveNegativeZero();

        // Step 6: Provide test inputs
        // Here, we simulate different inputs to test our conditionals.
        check.checkNumber(5);   // Expected output: positive
        check.checkNumber(0);   // Expected output: zero
        check.checkNumber(-5);  // Expected output: negative
        
    }
    
}

