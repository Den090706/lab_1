package ex4.test;
import ex3.Mobile_Operator;

public class Main_test {

    public static void main(String[] args) {
        test_determine_operator();
    }

    public static void test_determine_operator() {
        Mobile_Operator operator = new Mobile_Operator();
        
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
        operator.undo();
        
        // Перевірка для невідомих номерів
        assertEquals("He відомо", operator.determine_operator("0123456789"));
        operator.undo();
        
    }

    public static void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Тест пройдено: " + expected);
        } else {
            System.out.println("Tecт провалено! Очікуване: " + expected + ", отримане: " + actual);
        }
    }
}
