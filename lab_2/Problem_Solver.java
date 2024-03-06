import src.Calculation_Data;
/**
 * Цей клас представляє розв'язувач проблеми.
 * Він виконує обчислення та зберігає результати.
 */
public class Problem_Solver {
    public Calculation_Data calculationData;
    /**
     * Параметри 1 та 2 для обчислень та result для результату.
     */
        public double parameter_1; 
        public double parameter_2;
        public double result;
    
    /**
     * Конструктор класу ProblemSolver.
     * @param parameter1 Перший параметр для обчислень.
     * @param parameter2 Другий параметр для обчислень.
     */
    public Problem_Solver(double parameter1, double parameter2) {
        this.parameter_1 = parameter1;
        this.parameter_2 = parameter2;
        this.calculationData = new Calculation_Data(parameter1, parameter2);
    }

    /**
     * Метод для вирішення задачі.
     * Виконує обчислення та зберігає результат
     */
    public void solve() {
        result = parameter_1 + parameter_2;
        calculationData.setResult(result);
    }
    /** 
     * Виконує повернення результату.
     */
    public Calculation_Data getCalculationData() {
        return calculationData;
    }
    /**
     * Отримати результат обчислень.
     * @return Результат обчислень.
     */
    public void setCalculationData(Calculation_Data calculationData) {
        this.calculationData = calculationData;
    }
}
