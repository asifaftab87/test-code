package org.la.test.code.amazon.hackerrank.demo;

import java.util.*;

public class ProcessLogs {
    public static List<String> processLogs(List<String> logs, int threshold) {
        Map<String, Long> map = new HashMap<>();
        System.out.println("logs: "+logs);
        System.out.println("threshold: "+threshold);
        for (int i=0 ; i<logs.size() ; i++) {
            String[] arr = logs.get(i).split(" ");
            if (map.get(arr[0]) == null) {
                map.put(arr[0], 1L);
            } else {
                map.put(arr[0], map.get(arr[0]) + 1);
            }
            if(!arr[0].equals(arr[1])) {
                if (map.get(arr[1]) == null) {
                    map.put(arr[1], 1L);
                } else {
                    map.put(arr[1], map.get(arr[1]) + 1);
                }
            }
        }
        System.out.println(map);
        List<String> result = getThreshold(map, threshold);
        Collections.sort(result);
        return  result;
    }
    public static List<String> getThreshold(Map<String, Long> map, int threshold) {
        List<String> result = new ArrayList<>();
        for (Map.Entry m : map.entrySet()) {
            if((Long)m.getValue()>=threshold) {
                result.add((String) m.getKey());
            }
        }
        System.out.println("result: "+result);
        return result;
    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList("1 2 50", "1 7 70", "1 3 20", "2 2 17");//, "", "", "", "", "", "", "");
        logs = Arrays.asList("88 99 50", "88 99 70", "99 32 20", "12 12 17");//, "", "", "", "", "", "", "");
        List<String> result = processLogs(logs, 2);
        System.out.println(result);
    }
}
