package org.la.test.code.util;

import org.la.test.code.udm.dsa.dd.collect.ll.Node;

import java.util.Collection;
import java.util.Iterator;

public class Util {

    public static <T> void print(Collection<T> l) {
        System.out.print("[ ");
        int k = 0;
        for (Iterator i = l.iterator(); i.hasNext(); k++){
            if(k==l.size()-1){
                System.out.print(i.next() + " ");
            }
            else {
                System.out.print(i.next() + ", ");
            }
        }
        System.out.println("]");
    }

    public static <T>void print(T[] a){
        for(T i : a)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void print(int[] a){
        System.out.print("[ ");
        for (int i = 0 ; i<a.length-1 ; i++) {
            System.out.print(a[i]+", ");
        }
        if(a.length>0) {
            System.out.println(a[a.length-1]+" ]");
        }
    }

    public static void swap(Integer[] a, int s, int i) {
        int t = a[s];
        a[s] = a[i];
        a[i] = t;
    }

    public static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
