package org.la.test.code.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/*
 * URL: https://leetcode.com/problems/copy-list-with-random-pointer/description/
 * 138. Copy List with Random Pointer
 * A linked list of length n is given such that each node contains an additional random pointer, which could point
 * to any node in the list, or null. Construct a deep copy of the list. The deep copy should consist of exactly n
 * brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the
 * next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in
 * the original list and copied list represent the same list state. None of the pointers in the new list should point
 * to nodes in the original list. For example, if there are two nodes X and Y in the original list, where
 * X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
 * Return the head of the copied linked list. The linked list is represented in the input/output as a list of n nodes.
 * Each node is represented as a pair of [val, random_index] where: val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does
 * not point to any node. Your code will only be given the head of the original linked list.
 */
class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public String toString() {
        return val +"";
    }
}

public class CopyRandomList {

    public Node copyRandomList(Node srcHead) {
        if (srcHead == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node targetHead = createNewLinkedList(srcHead, map);
        mapRandomNode(srcHead, targetHead, map);
        return targetHead;
    }

    public Node createNewLinkedList(Node head, Map<Node, Node> map) {
        Node newNode = new Node(head.val);
        Node newHead = newNode;
        Node current = newHead;
        Node temp = head.next;
        map.put(head, newHead);
        while (temp != null) {
            newNode = new Node(temp.val);
            current.next = newNode;
            current = newNode;
            map.put(temp, newNode);
            temp = temp.next;
        }
        return newHead;
    }

    public void mapRandomNode(Node srcHead, Node trgtHead, Map<Node, Node> map) {
        Node srcTemp = srcHead;
        Node trgtTemp = trgtHead;
        while (srcTemp != null) {
         trgtTemp.random = map.get(srcTemp.random);
         trgtTemp = trgtTemp.next;
         srcTemp = srcTemp.next;
        }
    }

    public static void main(String[] args) {
        CopyRandomList copyRandomList = new CopyRandomList();
        Node head = copyRandomList.getHead();
        copyRandomList.copyRandomList(head);
    }

    Node getHead() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = null;
        return head;
    }

    public void display(Node head) {
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
    }
}
