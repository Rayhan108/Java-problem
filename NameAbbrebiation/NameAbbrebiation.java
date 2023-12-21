import java.util.Scanner;

public class NameAbbrebiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Process the full name to get abbreviations
        String[] nameParts = fullName.split(" ");
        int nameLength = nameParts.length;

        if (nameLength >= 1) {
            // Abbreviate the first name
            String firstName = abbreviate(nameParts[0]);
            System.out.print(firstName);

            // Abbreviate the middle names
            for (int i = 1; i < nameLength - 1; i++) {
                System.out.print("." + abbreviate(nameParts[i]));
            }

            // Display the last name as it is
            System.out.println(" " + nameParts[nameLength - 1]);
        } else {
            System.out.println("Invalid input. Please enter a valid full name.");
        }

        scanner.close();
    }

    // Function to abbreviate a name
    private static String abbreviate(String name) {
        if (name.length() > 0) {
            return name.substring(0, 1);
        } else {
            return "";
        }
    }
}
