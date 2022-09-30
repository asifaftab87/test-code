package org.la.test.code.collctn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableShoppingList {
    private final List<String> list;

    public ImmutableShoppingList(List<String> list){
        List<String> tempList = new ArrayList<>();
        tempList.addAll(list);
        this.list = Collections.unmodifiableList(tempList);
    }

    public List<String> getList(){
        return list;
    }

    @Override
    public String toString() {
        String res = "[";
        for(String l : list){
         res += l+", ";
        }
        res += "]";
        return res;
    }

    public String[] returnArray(){
        final List<String> l = Arrays.asList("a", "a", "a", "a", "a");
        return (String[]) l.toArray();
    }
}

