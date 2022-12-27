package org.la.test.code.thred;

public class NumOfProcessor {

    public static void main(String[] args) {
        int numOfProcessor = Runtime.getRuntime().availableProcessors();
        System.out.println("numOfProcessor: "+numOfProcessor);
    }
}
