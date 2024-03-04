import src.Calculation_Data;

public class Problem_Solver {
    public Calculation_Data calculationData;
        public double parameter_1; 
        public double parameter_2;
        public double result;
    

    public Problem_Solver(double parameter1, double parameter2) {
        this.parameter_1 = parameter1;
        this.parameter_2 = parameter2;
        this.calculationData = new Calculation_Data(parameter1, parameter2);
    }


    public void solve() {
        result = parameter_1 + parameter_2;
        calculationData.setResult(result);
    }

    public Calculation_Data getCalculationData() {
        return calculationData;
    }

    public void setCalculationData(Calculation_Data calculationData) {
        this.calculationData = calculationData;
    }
}
