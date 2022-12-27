package org.la.test.code.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QuerySelectorFromListInOrder {

    public static List<List<String>> solution(List<String> repository, final String customerQuery) {
        List<List<String>> returnValue = new ArrayList<>();
        List<String> sortedRepository = repository.stream()
                .filter(rep-> rep.startsWith(customerQuery.substring(0, 2)))
                .map(String::toLowerCase).collect(Collectors.toList());
        Collections.sort(sortedRepository);
        String customerQuery2 = customerQuery.toLowerCase();
        for(int i=2 ; i<=customerQuery.length() ; i++) {
            String tempQuery = customerQuery2.substring(0, i);
            List<String> singlePastResult = new ArrayList<>();
            for (String word : sortedRepository) {
                if (word.startsWith(tempQuery)) {
                    singlePastResult.add(word);
                    if (singlePastResult.size()==3) {
                        break;
                    }
                }
            }
            returnValue.add(singlePastResult);
        }
        return returnValue;
    }

    public static void main(String[] args) {
        List<String> repository = Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad", "leopard");
        String customQuery = "mouse";
        List<List<String>> returnValue = solution(repository, customQuery);
        System.out.println(returnValue);
    }
}
