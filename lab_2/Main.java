import domain.Calculation;

public class Main {
    public static void main(String[] args){
        Calculation_Factory Calculation_Factory = new Calculation_Factory();

        Calculation addition = factory.create_Calculation("addition");

        double result = addition.calculate(5, 3);

        System.out.println("Результат додавання: " + result);
    }
}