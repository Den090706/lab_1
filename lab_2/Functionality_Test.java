import domain.Calculation;
import src.Calculation_Data;

public class Functionality_Test {
    
    // Метод для тестування класу ProblemSolver
    public void testProblemSolver() {
        // Створення об'єкту ProblemSolver з тестовими параметрами
        Problem_Solver solver = new Problem_Solver(10.5, 20.7);
        
        // Виклик методу solve()
        solver.solve();
        
        /** Отримання та виведення результатів 
        * Виведення результату 
        */
        Calculation calculationData = solver.getCalculation_Data();
        System.out.println("Параметр 1: " + calculationData.getParameter1());
        System.out.println("Параметр 2: " + calculationData.getParameter2());
        System.out.println("Результат: " + calculationData.getResult());
    }
    
}
