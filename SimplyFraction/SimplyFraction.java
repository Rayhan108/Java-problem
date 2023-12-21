import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    // Constructor to initialize numerator and denominator
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Method to find the greatest common divisor (GCD)
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to simplify the fraction to its lowest terms
    public void simplifyFraction() {
        int gcd = findGCD(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;
    }

    // Method to print the fraction
    public void printFraction() {
        System.out.println("Simplified Fraction: " + numerator + "/" + denominator);
    }
}

public class SimplyFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Create an instance of the Fraction class
        Fraction fraction = new Fraction(numerator, denominator);

        // Simplify the fraction and print the result
        fraction.simplifyFraction();
        fraction.printFraction();

        scanner.close();
    }
}
