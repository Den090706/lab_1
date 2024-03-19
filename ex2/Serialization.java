package ex2;

import java.io.*;
import ex3.Mobile_Operator;

public class Serialization {
    public static void main(String[] args) {
        // Створюємо об'єкт для серіалізації
        Mobile_Operator operator = new Mobile_Operator();
        String phoneNumber = "0976724794";
        String operatorName = operator.determine_operator(phoneNumber);
        MobileOperatorCalculation calculation = new MobileOperatorCalculation(phoneNumber, operatorName);

        // Серіалізуємо об'єкт у файл
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("calculation.ser"))) {
            outputStream.writeObject(calculation);
            System.out.println("Об'єкт серіалізовано та збережено у файл 'calculation.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Відновлюємо об'єкт з файлу
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("calculation.ser"))) {
            MobileOperatorCalculation restoredCalculation = (MobileOperatorCalculation) inputStream.readObject();
            System.out.println("Об'єкт відновлено: " + restoredCalculation.getPhoneNumber() + ", " +
                    restoredCalculation.getOperatorName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
