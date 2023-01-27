package org.la.test.code.interview.encora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueue<E> implements Iterable<E> {

    private Lock lock = new ReentrantLock();
    private List<E> list;
    private int size;
    public CustomBlockingQueue(final int limit) {
        list = new ArrayList<>(limit);
        size = limit;
    }

    /**
     * Adds the element if space is available, if not then blocks the caller
     */
    public void offer(E element) {
        if (lock.tryLock()) {
            try {
                if (list.size()==size) {
                    wait();
                }
                list.add(element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();;
            }
        }
    }

    /**
     * Removes and returns the top element. Blocks the caller if empty
     */
    public E poll() {
        E element = null;
        if (lock.tryLock()) {
            try {
                if (list.size()==0) {
                    wait();
                }
                element = list.get(list.size()-1);
                list.remove(list.size()-1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();;
            }
        }
        return element;
    }

    /**
     * Returns the top element but doesnt remove it. Returns null if queue is empty. NonBlocking method
     */
    public E peek() {

        return null;
    }

    /**
     * Returns the size of the queue
     */
    public int size() {

        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
