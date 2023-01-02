package org.la.test.code.ps.pck.genr;



public class InjectorMain {

    public static void main(String[] args) {
        Injector injector = new Injector().with("Hello World");
        Logger logger =  injector.newInstance(Logger.class);
        logger.log();
    }
}
