package org.la.test.code.udm.dsa.dd.collect.ll;

import org.la.test.code.karumanchi.KarumanchiUtil;

/*
    Singly LinkList implementation
 */

public class LinkList {
    private static Node head;
    static int len = 0;

    public static void main(String[] args) {
        head = KarumanchiUtil.createLinkList(3);
        addToEnd(new Node(-1));
        addAtPosition(new Node(10), 2);
        KarumanchiUtil.print(head);
//        Node remove = removeFromHead();
//        System.out.println("removed begin: " + remove);
//        remove = removeFromEnd();
//        System.out.println("removed start: " + remove);
//        Node remove = removeFromPos(3);
//        System.out.println("removed pos: " + remove);
        reverse();
        System.out.println("After reverse");
        KarumanchiUtil.print(head);
        System.out.println("Total Node: " + totalNode());
    }

    //TODO: inserted and sorted, will insert and will sort linklist
    public static void insertSorted(Node node) {
        //complete this
    }

    //reverse
    public static void reverse() {
        Node curr = head, prev = null, next = null;
        while (curr!=null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //remove and return from specific position
    public static Node removeFromPos(int pos) {
        if (pos < 1 || head == null) {
            return removeFromHead();
        } else if (pos > totalNode()) {
            return removeFromEnd();
        }

        Node curr = head, prev = head;
        int i = 1;
        while(i<pos && curr!=null && curr.getNext()!=null) {
            prev = curr;
            curr = curr.getNext();
            i++;
        }
        prev.setNext(curr.getNext());
        curr.setNext(null);
        return curr;
    }

    //remove and return node at the end of list
    public static Node removeFromEnd() {
        if (head == null) {
            return null;
        }
        Node current = head, prev = head;
        while (current != null && current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
        prev.setNext(null);
        return current;
    }

    //remove and return node at the head of the list
    public static Node removeFromHead() {
        if (head == null) {
            return null;
        }
        Node remove = head;
        head = head.getNext();
        remove.setNext(null);
        return remove;
    }

    //add node at specific position
    public static void addAtPosition(Node node, int pos) {
        if (pos < 1 || head == null) {
            addToFront(node);
            return;
        } else if (pos > totalNode()) {
            addToEnd(node);
            return;
        }
        Node current = head;
        for (int i = 1; i < pos && current != null; i++) {
            current = current.getNext();
        }
        node.setNext(current.getNext());
        current.setNext(node);
    }

    //add as first element
    public static void addToFront(Node node) {
        node.setNext(head);
        head = node;
    }

    //add as last element
    public static void addToEnd(Node node) {
        if (head == null) {
            addToFront(node);
        } else {
            Node current = head;
            while (current != null && current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    //count total node in linklist
    public static int totalNode() {
        int count = 0;
        if (head == null) {
            return 0;
        }
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
