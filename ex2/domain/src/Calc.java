package src;


import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Містить реалізацію методів обчислення та відображення результатів
 * 
 *  @author xone
 *  @version 1.0
 */
public class Calc {
    /** Ім'я файлу, використовуване при серіалізації. */
    private static final String FNAME = "item_2.bin";
    /** Зберігає результат обчислень. Об'єкт класу {@linkplain item_2} */
    private item_2 result;

    /** Ініціалізує {@linkplain Calc#result} */
    public Calc() {
        result = new item_2();
    }

    /**
     * Встановлює значення {@linkplain Calc#result}
     * 
     * @param result - нове значення посилання на об'єкт {@linkplain item_2}
     */
    public void setResult(item_2 result) {
        this.result = result;
    }

    /**
     * Отримує значення {@linkplain Calc#result}
     * 
     * @return поточне значення посилання на об'єкт {@linkplain item_2}
     */
    public item_2 getResult() {
        return result;
    }

    /**
     * Обчислює значення функції.
     * 
     * @param x - аргумент обчислюваної функції.
     * @return результат обчислення функції.
     */
    private double calc(double x) {
        return Math.sin(x * Math.PI / 180);
    }

    /**
     * Обчислює значення функції та зберігає результат у об'єкті
     * {@linkplain Calc#result}
     * 
     * @param x - аргумент обчислюваної функції.
     */
    public double init(double x) {
        result.setX(x);
        return result.setY(calc(x));
    }

    /** Виводить результат обчислень. */
    public void show() {
        System.out.println(result);
    }

    /**
     * Зберігає {@linkplain Calc#result} у файлі {@linkplain Calc#FNAME}
     * 
     * @throws IOException
     */
    public void save() throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME))) {
            os.writeObject(result);
            os.flush();
        }
    }

    /**
     * Відновлює {@linkplain Calc#result} із файлу {@linkplain Calc#FNAME}
     * 
     * @throws Exception
     */
    public void restore() throws Exception {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME))) {
            result = (item_2) is.readObject();
        }
    }
}
