package hands.on.reactive.impl;

import hands.on.reactive.Observer;

public class ConcreteObserverA implements Observer<String> {
    @Override
    public void observe(String event) {
        System.out.println("Observer A: "+event);
    }
}
