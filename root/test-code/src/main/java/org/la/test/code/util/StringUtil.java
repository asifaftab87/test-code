package org.la.test.code.util;

public class StringUtil {

    public static <P> void swap(P[] arr, int i, int j) {
        P temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
