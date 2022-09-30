package hands.on.reactive;

public interface Observer<T> {
    void observe(T event);
}
