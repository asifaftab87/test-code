package hands.on.reactive.impl;

import hands.on.reactive.Observer;

public class ConcreteObserverB implements Observer<String> {
    @Override
    public void observe(String event) {
        System.out.println("Observer B: "+event);
    }
}
