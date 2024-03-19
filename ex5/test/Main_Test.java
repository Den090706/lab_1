package ex5.test;

import ex3.Mobile_Operator;

public class Main_Test {

    public static void main(String[] args) {
        test_determine_operator();
        test_undo();
    }

    public static void test_determine_operator() {
        Mobile_Operator operator = Mobile_Operator.getInstance();
        
        // Перевірка для номерів оператора "Київстар"
        assertEquals("Київстар", operator.determine_operator("0671234567"));
        assertEquals("Київстар", operator.determine_operator("0681234567"));
        assertEquals("Київстар", operator.determine_operator("0961234567"));
        assertEquals("Київстар", operator.determine_operator("0971234567"));
        assertEquals("Київстар", operator.determine_operator("0981234567"));
        
        // Перевірка для номерів оператора "Vodafone"
        assertEquals("Vodafone", operator.determine_operator("0501234567"));
        assertEquals("Vodafone", operator.determine_operator("0661234567"));
        assertEquals("Vodafone", operator.determine_operator("0951234567"));
        assertEquals("Vodafone", operator.determine_operator("0991234567"));
        
        // Перевірка для невідомих номерів
        assertEquals("He відомо", operator.determine_operator("0123456789"));
    }
    
    public static void test_undo() {
        Mobile_Operator operator = Mobile_Operator.getInstance();
        
        // Виконуємо кілька операцій
        operator.determine_operator("0976724794");
        operator.determine_operator("0671234567");
        operator.determine_operator("0501234567");
        
        // Скасовуємо останню операцію
        operator.undo();
        
        // Виводимо історію операцій
        operator.printHistory();
    }

    public static void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Тест пройдено: " + expected);
        } else {
            System.out.println("Tecт провалено! Очікуване: " + expected + ", отримане: " + actual);
        }
    }
}
