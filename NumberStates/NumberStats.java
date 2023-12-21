import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (number == 0) {
                zeroCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of 0s: " + zeroCount);

        scanner.close();
    }
}
