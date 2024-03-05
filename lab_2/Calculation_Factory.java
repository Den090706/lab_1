public class Calculation_Factory{
    public Calculation create_Calculation(String calculation){
        switch (operation) {
            case "Addition":
                return new Addition();
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}