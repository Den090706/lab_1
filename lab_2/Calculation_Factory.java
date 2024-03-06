public class Calculation_Factory{
    public Calculation create_Calculation(String calculation){
        String operation;
        switch (operation) {
            case "Addition":
                return new Addition();
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}