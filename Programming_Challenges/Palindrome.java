package Programming_Challenges;

import java.util.Scanner;

public class Palindrome {

    // Method 1: Check if a number is a palindrome
    public static boolean NumberPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // return true if palindrome
        return original == reversed;
    }

    // Method 2: Check if a word is a palindrome
    public static boolean WordPalindrome(String word) {
        word = word.toLowerCase();
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false; // not palindrome
            }
        }
        return true; // palindrome
    }

    // Main method: where we test everything
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose type to check:");
        System.out.println("1. Number");
        System.out.println("2. Word");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        input.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (NumberPalindrome(num)) {
                System.out.println(num + " is a palindrome number.");
            } else {
                System.out.println(num + " is not a palindrome number.");
            }

        } else if (choice == 2) {
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            if (WordPalindrome(word)) {
                System.out.println(word + " is a palindrome word.");
            } else {
                System.out.println(word + " is not a palindrome word.");
            }

        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}
