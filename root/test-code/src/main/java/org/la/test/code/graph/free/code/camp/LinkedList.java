package org.la.test.code.graph.free.code.camp;

public class LinkedList<T> {

    Node<T> head;

    public void addTohead(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addToTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head==null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext()!=null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public T removeHead() {
        if (head==null) {
            return null;
        }
        Node<T> temp = head;
        head = head.getNext();
        return temp.getData();
    }
}
