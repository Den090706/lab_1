package ex3;

import java.util.Stack;

public class Mobile_Operator {
    private Stack<String> history; // Історія операцій

    private static Mobile_Operator instance;

    // Приватний конструктор для Singleton
    public Mobile_Operator() {
        history = new Stack<>();
    }

    // Метод для отримання єдиного екземпляру класу
    public static Mobile_Operator getInstance() {
        if (instance == null) {
            instance = new Mobile_Operator();
        }
        return instance;
    }

    // Метод для виконання операції і збереження її в історії
    public String determine_operator(String phone_number) {
        String operator = determineOperatorInternal(phone_number);
        history.push(operator); // Додаємо операцію в історію
        return operator;
    }

    // Приватний метод для визначення оператора за номером телефону
    private String determineOperatorInternal(String phone_number) {
        String operator_cod = phone_number.substring(0, 3);
        switch (operator_cod) {
            case "067":
            case "068":
            case "096":
            case "097":
            case "098":
                return "Київстар";
            case "050":
            case "066":
            case "095":
            case "099":
                return "Vodafone";
            default:
                return "He відомо";
        }
    }

    // Метод для скасування останньої операції
    public void undo() {
        if (!history.isEmpty()) {
            history.pop(); // Видаляємо останню операцію з історії
        }
    }

    // Метод для очищення історії
    public void clearHistory() {
        history.clear();
    }

    // Метод для виведення історії операцій
    public void printHistory() {
        System.out.println("Історія операцій:");
        for (String operator : history) {
            System.out.println(operator);
        }
    }
}