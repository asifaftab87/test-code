package org.la.test.code.ps.pck.genr;

public class TypeSafeExample {

    public static void main(String[] args) {
        CircularBuffer<String> buffer = new CircularBuffer<>(10);
        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");
        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(CircularBuffer buffer) {
        StringBuilder result = new StringBuilder();
        String value;
        while ((value = (String)buffer.poll()) != null) {
            result.append(value);
        }
        return result.toString();
    }
}
