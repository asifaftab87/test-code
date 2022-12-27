package org.la.test.code.thred.impl.concurnc;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        System.out.println("in Callable call method.");
        return new Object();
    }
}
