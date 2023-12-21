import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Prime Factors of " + number + ": ");
            findPrimeFactors(number);
        }

        scanner.close();
    }

    // Function to find and print prime factors of a number
    private static void findPrimeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
