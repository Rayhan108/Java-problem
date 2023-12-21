import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {
        // Define the cost per unit
        final int COST_PER_UNIT = 100;

        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");

        // Read the quantity from the user
        int quantity = scanner.nextInt();

        // Calculate the total cost
        int totalCost = quantity * COST_PER_UNIT;

        // Apply discount if total cost is more than 1000
        if (totalCost > 1000) {
            double discount = 0.10 * totalCost;
            totalCost -= discount;
            System.out.println("Discount Applied: 10%");
        }

        // Print the total cost
        System.out.println("Total Cost: $" + totalCost);

        // Close the scanner
        scanner.close();
    }
}
