package org.la.test.code.udm.dsa.dd.collect.ll;

public class LinkListTwo {
    private Node head;
    int len = 0;
    public static void main(String[] args) {

    }

    //add as first element
    public void addToFront(Node n) {
        n.setNext(head);
        head = n;
        len++;
    }

}
