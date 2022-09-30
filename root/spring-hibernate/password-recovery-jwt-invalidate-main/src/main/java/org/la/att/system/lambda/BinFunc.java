package org.la.att.system.lambda;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BinaryOperator;

@Slf4j
public class BinFunc {
    static Logger log = LoggerFactory.getLogger(BinFunc.class);

    public static void main(String[] args) {

        BinaryOperator<Long> sum = (x, y) -> x+y;

        long s = sum.apply(1l, 2l);
        log.info("s: {}", s);
    }

}
