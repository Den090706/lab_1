package domain;

import src.Comand_History;
import src.Command_Executor;
import domain.Command;

public class Main {
    public static void main(String[] args){

        Command_Executor executor = Command_Executor.get_Instance();
        Command command = new Command();
        executor.execute_Command(command);
        executor.undo_last_Command();
    }
}
