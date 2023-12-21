import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(resultReal, resultImaginary);
    }

    // Method to print the complex number
    public void printComplex() {
        System.out.println("(" + real + " + " + imaginary + "i)");
    }
}

public class ComplexOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("\nEnter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        // Create instances of the Complex class
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // Perform operations and print results
        System.out.println("\nSum:");
        Complex sumResult = complex1.add(complex2);
        sumResult.printComplex();

        System.out.println("\nDifference:");
        Complex diffResult = complex1.subtract(complex2);
        diffResult.printComplex();

        System.out.println("\nProduct:");
        Complex productResult = complex1.multiply(complex2);
        productResult.printComplex();

        scanner.close();
    }
}
