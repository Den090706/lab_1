package ex4.src;

// Main.java
import java.util.Scanner;
import ex3.Mobile_Operator;

public class Main {
    public static void main(String[] args) {
        // Create a factory for text result display
        Result_Display_Factory factory = new Text_Result_Display_Factory(10, 10);
        Result_Display resultDisplay = factory.createResultDisplay();

        // Use Scanner to get user input for phone number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone_number = scanner.nextLine();

        // Determine operator based on phone number
        Mobile_Operator operator = new Mobile_Operator();
        String operator_name = operator.determine_operator(phone_number);

        // Prepare data for displaying
        String[][] data = {{"Phone Number", "Operator"}, {phone_number, operator_name}};

        // Display the result
        resultDisplay.displayResult(data);

        // Close the scanner
        scanner.close();
    }
}
