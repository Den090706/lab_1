import java.io.*;
import java.util.ArrayList;
import src.Calculation_Data;

public class Calculation_Results_Manager {
    public static void saveResults(ArrayList < Calculation_Result > results, String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(results);
        }
    }

    public static ArrayList<CalculationResult> loadResults(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<CalculationResult>) inputStream.readObject();
        }
    }
}
