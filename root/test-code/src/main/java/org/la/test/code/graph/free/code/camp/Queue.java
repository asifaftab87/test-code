package org.la.test.code.graph.free.code.camp;

public class Queue<T> {

    private int size;
    LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T data) {
        queue.addToTail(data);
        size++;
    }

    public T peek() {
        return this.isEmpty() ? null : queue.head.getData();
    }

    public T dequeue() throws Exception {
        if (!this.isEmpty()) {
            T data = queue.removeHead();
            this.size--;
            return data;
        }
        throw new Exception("queue is empty");
    }

}
