package src;
import java.util.Stack;

import domain.Command;
/**
 * Клас, що керує історією команд
 * 
 */ 
public class Comand_History {
    private Stack<Command> history = new Stack<>();

    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        return history.pop();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}