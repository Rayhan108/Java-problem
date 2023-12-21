import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");

        // Read marks from the user
        int marks = scanner.nextInt();

        // Determine the grade based on the given rules
        String grade;
        if (marks < 25) {
            grade = "F";
        } else if (marks >= 25 && marks < 45) {
            grade = "E";
        } else if (marks >= 45 && marks < 50) {
            grade = "D";
        } else if (marks >= 50 && marks < 60) {
            grade = "C";
        } else if (marks >= 60 && marks <= 80) {
            grade = "B";
        } else {
            grade = "A";
        }

        // Print the corresponding grade
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
