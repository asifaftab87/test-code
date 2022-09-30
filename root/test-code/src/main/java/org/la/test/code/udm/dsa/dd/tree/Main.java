package org.la.test.code.udm.dsa.dd.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
//        tree.insert(2);
//        tree.insert(12);
//        tree.insert(11);
//        tree.insert(49);
//        tree.insert(20);
//        tree.insert(-32);
//        tree.insert(1);
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);
        tree.traverseInOrder();
        System.out.println();
//        System.out.println(tree.get(1));
//        System.out.println(tree.get(-1));
//        System.out.println("Min: "+tree.min());
//        System.out.println("Max: "+tree.max());
        tree.traversePreOrder();
    }
}
