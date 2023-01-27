package org.la.test.code.graph.free.code.camp;

public class QueueObject<T> implements Comparable<QueueObject> {

    public T data;
    public int priority;

    public QueueObject(T t, int p){
        this.data = t;
        this.priority = p;
    }

    @Override
    public int compareTo(QueueObject o) {
        if (this.priority == o.priority){
            return 0;
        }
        else if (this.priority > o.priority){
            return 1;
        }
        else {
            return -1;
        }
    }
}