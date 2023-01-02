package org.la.test.code.util;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapUtilTest {

    /** to check two map equals or not based on key and value pair but not on order */
    @Test
    public void sortByValueDescTest() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("b", 3);
        map.put("a", 2);
        map.put("d", 1);
        map.put("c", 2);
        Map<String, Integer> mapUnordered = new HashMap<>();
        mapUnordered.put("a", 2);
        mapUnordered.put("c", 2);
        mapUnordered.put("d", 1);
        mapUnordered.put("b", 3);
        System.out.println("map: "+map);
        System.out.println("value desc: "+MapUtil.mapSortByValueDesc(mapUnordered));
        assertEquals(map, MapUtil.mapSortByValueDesc(mapUnordered));
    }

    @Test
    public void sortByValueTest() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String ms = "abdbbcca";
        map.put("d", 1);
        map.put("a", 2);
        map.put("c", 2);
        map.put("b", 3);
        Map<String, Integer> mapUnordered = new HashMap<>();
        mapUnordered.put("c", 2);
        mapUnordered.put("a", 2);
        mapUnordered.put("d", 1);
        mapUnordered.put("b", 3);

        assertEquals(map, MapUtil.mapSortByKeyDesc(mapUnordered));
    }

    @Test
    public void sortByKeyTest() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String ms = "abdbbcca";
        map.put("a", 2);
        map.put("b", 3);
        map.put("c", 2);
        map.put("d", 1);
        Map<String, Integer> mapUnordered = new HashMap<>();
        mapUnordered.put("c", 2);
        mapUnordered.put("a", 2);
        mapUnordered.put("d", 1);
        mapUnordered.put("b", 3);

        assertEquals(map, MapUtil.mapSortByKeyDesc(mapUnordered));
    }

    @Test
    public void sortByKeyDescTest() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String ms = "abdbbcca";
        map.put("d", 1);
        map.put("c", 2);
        map.put("b", 3);
        map.put("a", 2);
        Map<String, Integer> mapUnordered = new HashMap<>();
        mapUnordered.put("c", 2);
        mapUnordered.put("d", 1);
        mapUnordered.put("b", 3);
        mapUnordered.put("a", 2);

        assertEquals(map, MapUtil.mapSortByKeyDesc(mapUnordered));
    }

}
