package org.la.test.code.karumanchi;

import org.la.test.code.udm.dsa.dd.collect.ll.Node;

public class KarumanchiUtil {

    public static void print(Node head) {
        Node current = head;
        while (current!=null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public static Node createLinkList(int size) {
        Node head = null;
        Node previousNode = null;
        for(int i=1 ; i<=size ; i++) {
            Node n = new Node(i);
            if(head==null) {
                head = n;
                previousNode = head;
            } else {
                previousNode.setNext(n);
                previousNode = previousNode.getNext();
            }
        }
        return head;
    }
}
