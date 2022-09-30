package org.la.att.system.hacker.rank;

import java.util.ArrayList;
import java.util.List;

public class StringsCollection {
    static volatile List<String> stringsCollection = new ArrayList<>();

    public void addString(String string){
        synchronized (this) {
            stringsCollection.add(string);
        }
    }
    public List<String> getStringsCollection(){
        return stringsCollection;
    }
}