import domain.Calculation;

public class Addition implements Calculation{
    public double calculate (double operand1, double operand2) {
        return operand1 + operand2;
    }  
}