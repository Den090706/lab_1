import java.io.*;

import src.Calculation_Data;

public class Serialization{
    public static void main(String[] args) {
        Calculation_Data data = new Calculation_Data(10, 20);
        
        serializeObject(data, "data.ser");
        
        Calculation_Data restoredData = deserializeObject("data.ser");
        
        System.out.println("Параметр 1: " + restoredData.getParameter1());
        System.out.println("Параметр 2: " + restoredData.getParameter2());
        System.out.println("Результат: " + restoredData.getResult());
    }
    
    private static void serializeObject(Calculation_Data data, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Calculation_Data deserializeObject(String fileName) {
        Calculation_Data data = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            data = (Calculation_Data) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
