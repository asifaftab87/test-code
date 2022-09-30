package org.la.test.code.collctn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableShoppingListMain {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        ImmutableShoppingList working = new ImmutableShoppingList(originalList);
        System.out.println("Toarray: "+working.returnArray());
//        originalList = Collections.unmodifiableList(originalList);
        originalList.add("candy bar");
        ImmutableShoppingListFail blah = new ImmutableShoppingListFail(originalList);
        originalList.add("fish");
//        System.out.println(originalList);
//        System.out.println(blah);
//        System.out.println(working);
    }
}
