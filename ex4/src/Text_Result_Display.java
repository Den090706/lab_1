package ex4.src;

// TextResultDisplay.java
public class Text_Result_Display implements Result_Display {
    public int rows;
    public int columns;

    public Text_Result_Display(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void displayResult(String[][] data) {
        // Реалізація відображення даних у форматі текстової таблиці
    }
}