class Rectangle {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        // Create two instances of the Rectangle class
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        // Calculate and print the area of each rectangle
        System.out.println("Area of Rectangle 1: " + rectangle1.calculateArea());
        System.out.println("Area of Rectangle 2: " + rectangle2.calculateArea());
    }
}
