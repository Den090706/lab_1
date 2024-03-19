package ex7;
import java.util.Scanner;

import ex3.Mobile_Operator;

public class Mobile_OperatorGUI {

    private Mobile_Operator mobileOperator;

    public Mobile_OperatorGUI() {
        this.mobileOperator = new Mobile_Operator();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;

        do {
            System.out.print("Enter a phone number (or 'exit' to quit): ");
            phoneNumber = scanner.nextLine();

            if (!phoneNumber.equals("exit")) {
                String operator = mobileOperator.determine_operator(phoneNumber);
                System.out.println("Operator for " + phoneNumber + ": " + operator);
            }
        } while (!phoneNumber.equals("exit"));

        scanner.close();
    }

    public static void main(String[] args) {
        Mobile_OperatorGUI cli = new Mobile_OperatorGUI();
        cli.run();
    }
}