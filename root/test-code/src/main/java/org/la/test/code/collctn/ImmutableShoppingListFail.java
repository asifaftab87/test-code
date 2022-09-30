package org.la.test.code.collctn;

import java.util.Collections;
import java.util.List;

public class ImmutableShoppingListFail {
    private final List<String> list;

    public ImmutableShoppingListFail(List<String> list){
        this.list = Collections.unmodifiableList(list);
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
}
