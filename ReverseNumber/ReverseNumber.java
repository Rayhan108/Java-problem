import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");

        // Read the 4-digit number from the user
        int number = scanner.nextInt();

        // Validate if the input is a 4-digit number
        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        } else {
            // Calculate the reversed number
            int reversedNumber = reverseDigits(number);

            // Print the reversed number
            System.out.println("Reversed Number: " + reversedNumber);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
