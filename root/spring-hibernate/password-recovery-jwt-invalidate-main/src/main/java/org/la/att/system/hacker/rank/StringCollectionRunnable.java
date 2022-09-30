package org.la.att.system.hacker.rank;

public class StringCollectionRunnable implements Runnable{
    private final StringsCollection stringsCollection;
    private final int stringCount;
    private final  String threadName;

    public StringCollectionRunnable(StringsCollection stringsCollection, int stringCount, String threadName){
        this.stringsCollection = stringsCollection;
        this.stringCount = stringCount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int j=0 ; j<stringCount ; j++){
            this.stringsCollection.addString(threadName + String.valueOf(j+1));
        }
    }
}
