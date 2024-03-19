package ex4.src;

/**  TextResultDisplayFactory реаліє фабричний метод і повертає об'єкти, 
 *   які можуть виводити результати у вигляді текстової таблиці.
*/
public class Text_Result_Display_Factory extends Result_Display_Factory {
    private int rows;
    private int columns;

    public Text_Result_Display_Factory(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public Result_Display createResultDisplay() {
        return new Text_Result_Display(rows, columns);
    }
}