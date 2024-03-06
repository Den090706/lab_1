import src.Simple_Table;
import src.Pretty_Table;

public class Tables_Creation {
    public double create_Tables(String type){
        switch (type) {
            case "simple":
                return Simple_Table();
            case "pretty":
                return Pretty_Table();
            default:
                throw new Exception()"Введіть 'simple' a6o 'pretty' для створення таблиці.");
        }
    }
