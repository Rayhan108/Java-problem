import java.util.Scanner;

class RectangleArea {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create an instance of the RectangleArea class
        RectangleArea rectangle = new RectangleArea(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.returnArea();
        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}
