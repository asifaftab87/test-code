package org.la.att.system.lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

public class PredictOne {
    static Logger log = LoggerFactory.getLogger(PredictOne.class);
    public static void main(String[] args) {
        Predicate<Long> pr = x -> x>0;
        boolean b = pr.test(-4l);
        log.info("result: {}", b);
    }
}
