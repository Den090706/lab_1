package ex2;

import java.io.Serializable;

// Клас, що зберігає параметри і результати обчислень
public class MobileOperatorCalculation implements Serializable {
    private String phoneNumber;
    private String operatorName;

    // Конструктор класу
    public MobileOperatorCalculation(String phoneNumber, String operatorName) {
        this.phoneNumber = phoneNumber;
        this.operatorName = operatorName;
    }

    // Геттери та сеттери для доступу до полів класу
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}