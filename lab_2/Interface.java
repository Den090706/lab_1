import java.util.Scanner;

import src.Calculation_Data;


public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший параметр:");
        double parameter1 = scanner.nextDouble();

        System.out.println("Введіть другий параметр:");
        double parameter2 = scanner.nextDouble();

        Problem_Solver solver = new Problem_Solver(parameter1, parameter2);

        solver.solve();

        Calculation_Data calculationData = solver.getCalculationData();

        System.out.println("Результат:");
        System.out.println("Параметр 1: " + calculationData.getParameter1());
        System.out.println("Параметр 2: " + calculationData.getParameter2());
        System.out.println("Результат: " + calculationData.getResult());

        scanner.close();
    }
}

