package ex3;

// Клас для виведення результатів у консоль
public class Console_Display implements Display {
    @Override
    public void displayResult(String message) {
        System.out.println(message);
    }
}
