package org.la.test.code.strng;

public class InternMethod {
    public static void main(String[] args) {

        String str1 = new String("Welcome to JavaTpoint.");
        String str2 = new String("Welcome to JavaTpoint");
        System.out.println(str1 == str2); // prints false

        /*
            We know that creating an object is a costly operation in Java. Therefore, to save time, Java developers came up
            with the concept of String Constant Pool (SCP). The SCP is an area inside the heap memory. It contains the
            unique strings. In order to put the strings in the string pool, one needs to call the intern() method.
            Before creating an object in the string pool, the JVM checks whether the string is already present in the
            pool or not. If the string is present, its reference is returned.
         */
        String str3 = new String("Welcome to JavaTpoint").intern(); // statement - 1
        String str4 = new String("Welcome to JavaTpoint").intern(); // statement - 2
        System.out.println(str3 == str4); // prints true
    }
}
