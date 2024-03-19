package ex7;

import java.util.ArrayList;
import java.util.List;

// Клас, що виступає як об'єкт, що спостерігається
public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            // Викликати метод спостерігача, який має бути визначений у класі, який реалізує анотацію Observer_Annotation
            observer.update(this);
        }
    }
}
