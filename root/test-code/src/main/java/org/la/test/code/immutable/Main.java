package org.la.test.code.immutable;

class Test {
    int x, y;
}
 
// Contains a reference of Test and
// implements clone with shallow copy.
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
 
// Driver class
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {

        Test2 original = new Test2();
        original.a = 1;
        original.b = 1;
        original.c.x = 1;
        original.c.y = 1;
 
        Test2 clone = (Test2)original.clone();
 
        // Creating a copy of object original
        // and passing it to clone
        clone.a = 100;
 
        // Change in primitive type of clone will
        // not be reflected in original field
        clone.c.x = 300;
 
        // Change in object type field will be
        // reflected in both clone and original(shallow copy)
        System.out.println("original: "+original.a + " " + original.b + " " + original.c.x + " " + original.c.y);
        System.out.println("clone: "+clone.a + " " + clone.b + " " + clone.c.x + " " + clone.c.y);
    }
}