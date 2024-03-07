package src;
import domain.Command;
import src.Comand_History;

public class Command_Executor {

    private static Command_Executor instance;
    private  Comand_History history = new Comand_History();

    public static Command_Executor getInstance(){
        
        if (instance == null) {
            instance = new Command_Executor();
        }
        return instance;
    }

    public void execute_Command(Command Calculation){
        Calculation.execute();
        history.push(Calculation);
   }

   public void undo_last_Command(){
    if (history != isEmpty()) {
        Command command = history.pop();
        command.undo();
    }
   }
}