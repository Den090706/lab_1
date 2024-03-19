package src;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Обчислення та відображення результатів.
 * Містить реалізацію статичного методу main().
 * @author xone
 * @version 1.0
 * @see Main#main
 */
public class Main {
    /** Об'єкт класу {@linkplain Calc}.
     * Розв'язує завдання індивідуального завдання. */
    private Calc calc = new Calc();

    /** Відображає меню. */
    private void menu() {
        String s = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            do {
                System.out.println("Введіть команду...");
                System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore: ");
                try {
                    s = in.readLine();
                } catch(IOException e) {
                    System.out.println("Помилка: " + e);
                    System.exit(0);
                }
            } while (s.length() != 1);
            switch (s.charAt(0)) {
                case 'q':
                    System.out.println("Вихід.");
                    break;
                case 'v':
                    System.out.println("Перегляд поточного.");
                    calc.show();
                    break;
                case 'g':
                    System.out.println("Випадкове генерування.");
                    calc.init(Math.random() * 360.0);
                    calc.show();
                    break;
                case 's':
                    System.out.println("Збереження поточного.");
                    try {
                        calc.save();
                    } catch (IOException e) {
                        System.out.println("Помилка серіалізації: " + e);
                    }
                    calc.show();
                    break;
                case 'r':
                    System.out.println("Відновлення останнього збереженого.");
                    try {
                        calc.restore();
                    } catch (Exception e) {
                        System.out.println("Помилка серіалізації: " + e);
                    }
                    calc.show();
                    break;
                default:
                    System.out.print("Неправильна команда. ");
            }
        } while(s.charAt(0) != 'q');
    }

    /** Виконується при запуску програми.
     * Обчислюється значення функції для різних аргументів.
     * Результати обчислень виводяться на екран.
     * @param args - параметри запуску програми.
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
