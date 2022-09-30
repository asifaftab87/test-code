package hands.on.reactive.impl;

import hands.on.reactive.Observer;
import hands.on.reactive.Subject;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcreteSubject implements Subject<String> {

    private final Set<Observer<String>> observers = new CopyOnWriteArraySet<>();    // (1)

    public void registerObserver(Observer<String> observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer<String> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {     // (2)
        observers.forEach(observer -> observer.observe(event));     // (2.1)
    }
}