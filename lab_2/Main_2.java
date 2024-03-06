import src.Child;
import src.Parent;

public class Main_2 {
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();

        // Призначення методів
        Parent dynamicParent = new Child();

        // Заміщення методів
        parent.display();
        child.display();

        parent.print();
        child.print();

        // Поєднання
        child.print("Hello");

        dynamicParent.display();
        dynamicParent.print();
    }
}