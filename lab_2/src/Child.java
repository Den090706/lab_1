package src;

public class Child extends Parent{
    public void display(){
        System.out.println("Child's display method");
    }

    public void print(String message){
        System.out.println("Child's print method" + message);
    }
}