package hands.on.reactive.test;

import hands.on.reactive.Observer;
import hands.on.reactive.Subject;
import hands.on.reactive.impl.ConcreteObserverA;
import hands.on.reactive.impl.ConcreteObserverB;
import hands.on.reactive.impl.ConcreteSubject;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

public class ObserverSubjectTest {
    @Test
    public void test(){
        Subject<String> subject = new ConcreteSubject();
        Observer<String> observerA = Mockito.spy(new ConcreteObserverA());
        Observer<String> observerB = Mockito.spy(new ConcreteObserverB());
        subject.notifyObservers("No listeners");
        subject.registerObserver(observerA);
        subject.notifyObservers("Message for A");
        subject.registerObserver(observerB);
        subject.notifyObservers("Message for A & B");
        subject.unregisterObserver(observerA);
        subject.notifyObservers("Message for B");
        subject.unregisterObserver(observerB);
        subject.notifyObservers("No listeners");
        Mockito.verify(observerA, times(1)).observe("Message for A");
        Mockito.verify(observerA, times(1)).observe("Message for A & B");
        Mockito.verifyNoMoreInteractions(observerA);
        Mockito.verify(observerB, times(1)).observe("Message for A & B");
        Mockito.verify(observerB, times(1)).observe("Message for B");
        Mockito.verifyNoMoreInteractions(observerB);
    }

    @Test
    public void subjectLeveragesLambdas() {
        Subject<String> subject = new ConcreteSubject();
        subject.registerObserver(e -> System.out.println("A: " + e));
        subject.registerObserver(e -> System.out.println("B: " + e));
        subject.notifyObservers("This message will receive A & B");
    }
}