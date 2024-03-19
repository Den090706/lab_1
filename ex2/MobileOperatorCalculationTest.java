package ex2;

import ex3.Mobile_Operator;

public class MobileOperatorCalculationTest {
    public static void main(String[] args) {
        testCalculation();
    }

    public static void testCalculation() {
        String phoneNumber = "0976724794";
        Mobile_Operator operator = new Mobile_Operator();
        String operatorName = operator.determine_operator(phoneNumber);
        MobileOperatorCalculation calculation = new MobileOperatorCalculation(phoneNumber, operatorName);

        // Перевіряємо, чи коректно ініціалізовані поля об'єкта
        if (phoneNumber.equals(calculation.getPhoneNumber()) &&
                operatorName.equals(calculation.getOperatorName())) {
            System.out.println("Тест пройшов успішно." + " Очтримані значення: " + phoneNumber + ", " + operatorName);
        } else {
            System.out.println("Тест не пройшов. Очікувані значення: " + phoneNumber + ", " + operatorName +
                    ", отримані значення: " + calculation.getPhoneNumber() + ", " + calculation.getOperatorName());
        }
    }
}