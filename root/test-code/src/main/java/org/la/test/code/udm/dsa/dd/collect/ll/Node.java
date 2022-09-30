package org.la.test.code.udm.dsa.dd.collect.ll;

public class Node {

    private int data;
    private Node next;
    public Node(int i) {
        data = i;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        this.data = d;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{ Node: "+data+" }";
    }
}
