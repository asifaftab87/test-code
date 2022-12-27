package org.la.test.code.thred.impl.concurnc.ddlck;

public class LiveLock {

    public static void main(String[] args) {
        run();
    }
    
    public static void run() {
        PhoneCall buddy1 = new PhoneCall("Patricia");
        PhoneCall buddy2 = new PhoneCall("Patrick");
        HangUp hangUpAction = new HangUp(buddy1);
        new Thread(() -> buddy1.endCallWith(hangUpAction, buddy2)).start();
        new Thread(() -> buddy2.endCallWith(hangUpAction, buddy1)).start();
    }

    static class PhoneCall {

        private String name;
        private boolean isDone;

        PhoneCall(String name) {
            this.name = name;
            isDone = false;
        }

        public String getName() {
            return name;
        }

        public boolean isDone() {
            return isDone;
        }

        void endCallWith(HangUp hangUp, PhoneCall buddy) {
            while (!isDone) {
                if (hangUp.caller != this) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        continue;
                    }
                    continue;
                }
                if (!buddy.isDone) {
                    System.out.println(name + ": No you hang up, buddy " + buddy.getName());
                    hangUp.setCaller(buddy);
                    continue;
                }
                hangUp.end();
                buddy.isDone = true;
                isDone = true;
            }
        }
    }

    static class HangUp {

        private PhoneCall caller;

        HangUp(PhoneCall caller) {
            this.caller = caller;
        }

        void setCaller(PhoneCall caller) {
            this.caller = caller;
        }

        void end() {
            System.out.println(caller.name + " has hang up!");
        }
    }
}
