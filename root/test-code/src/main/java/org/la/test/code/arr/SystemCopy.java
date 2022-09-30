package org.la.test.code.arr;

import org.la.test.code.util.Util;

public class SystemCopy {
    public static void main(String[] args) {
        int[] s = {3,2,4,9,-3,-1,5};
        int[] d = new int[s.length];
        System.arraycopy(s, 0, d, 3, 2);
        Util.print(d);
    }
}
