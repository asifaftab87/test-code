package org.la.att.system.lambda;

import java.util.function.Function;

public class FuncThree {
    public static void main(String[] args) {
        Function<Integer, String> func = f ->{
            if(f==0)
                return "0";
            return "str";
        };
        String s = func.apply(10);
        System.out.println("result: "+s);
    }
}
