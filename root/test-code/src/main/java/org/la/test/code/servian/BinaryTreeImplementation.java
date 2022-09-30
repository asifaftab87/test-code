package org.la.test.code.servian;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeImplementation {

    private static String[] account = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", };
    private static String[] pAccount = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", };

    private void readCSVFile() {
        Map<String, String> map = new HashMap<>();
        map.put("A1", null);
        map.put("A2", "A1");
        map.put("A3", "A2");
        map.put("A4", "A2");
        map.put("A5", "A1");
        map.put("A6", "A5");
        map.put("A7", null);
        map.put("A8", "");
        map.put("A9", "");
        map.put("A10", "");
    }

}
