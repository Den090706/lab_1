package src;

import java.io.Serializable;

/** Зберігає вихідні дані та результати обчислень. */
public class item_2 implements Serializable {
    /** Аргумент обчислюваної функції. */
    private double x;
    /** Результат обчислення функції. */
    private double y;

    /** Автоматично згенерована константа. */
    private static final long serialVersionUID = 1L;

    /** Ініціалізує поля {@linkplain item_2#x}, {@linkplain item_2#y}. */
    public item_2() {
        x = .0;
        y = .0;
    }

    /**
     * Встановлює значення полів: аргументу та результату обчислення функції.
     * 
     * @param x - значення для ініціалізації поля {@linkplain item_2#x}
     * @param y - значення для ініціалізації поля {@linkplain item_2#y}
     */
    public item_2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Встановлення значення поля {@linkplain Item_2#x}. */
    public double setX(double x) {
        return this.x = x;
    }

    /** Отримання значення поля {@linkplain item_2#x}. */
    public double getX() {
        return x;
    }

    /** Встановлення значення поля {@linkplain item_2#y}. */
    public double setY(double y) {
        return this.y = y;
    }

    /** Отримання значення поля {@linkplain item_2#y}. */
    public double getY() {
        return y;
    }

    /**
     * Встановлення значень {@linkplain item_2#x} та {@linkplain item_2#y}.
     * 
     * @param x - значення для {@linkplain item_2#x}
     * @param y - значення для {@linkplain item_2#y}
     * @return this
     */
    public item_2 setXY(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }

    /** Представлення результатів обчислень у вигляді рядка. */
    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    /** Автоматично згенерований метод порівняння об'єктів. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

            item_2 other = (item_2) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;

        // Змінено порівняння результату обчислення функції
        if (Math.abs(Math.abs(y) - Math.abs(other.y)) > .1e-10)
            return false;
        return true;
    }
}