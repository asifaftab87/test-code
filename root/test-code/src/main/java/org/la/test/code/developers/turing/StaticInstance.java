package org.la.test.code.developers.turing;

/*
    parent instance method can be overridden by child instance method
    parent static method can be overridden by child static method
    vice versa not possible, it is a compile time error
 */
class Super {
    void fun() {
        System.out.println("Parent instance method fun");
    }
    static void funs(){
        System.out.println("Parent static method fun");
    }
}
class Simple extends Super {
    void fun() {
        System.out.println("Child instance method fun");
    }
    static void funs(){
        System.out.println("Child static method fun");
    }
}
public class StaticInstance {
    public static void main(String[] args) {
        Super s = new Simple();
        s.fun();
        s.funs();
    }
}
