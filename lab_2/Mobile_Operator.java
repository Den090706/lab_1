public class Mobile_Operator{
    public String determine_operator(String phone_number){
        String operator_cod = phone_number.substring(0, 3);
        switch (operator_cod) {
            case "067":
            case "068":
            case "096":
            case "097":
            case "098":
                return "Київстар";
            case "050":
            case "066": 
            case "095":
            case "099":
                return "Vodafone";
            default:
                return "He відомо";
        }    
    } 


public static void main(String[] args){
    Mobile_Operator operator_1 = new Mobile_Operator();
    String phone_number = "0976724794";
    String operator_name = operator_1.determine_operator(phone_number);
    System.out.println("Mo6iльний. оператор для номера " + phone_number + ": "+ operator_name);
    }
}