package org.la.test.code.ninja;

import org.la.test.code.util.MapUtil;

import java.util.Map;
import java.util.PriorityQueue;

/**
 * URL:
 * https://www.codingninjas.com/codestudio/problems/rearrange-string_985247?topList=top-amazon-coding-interview-questions
 * You are given a string of lowercase characters. Your task is to rearrange (reorder)  the string in such a way that
 * no two adjacent characters are the same. You have to return the rearranged string. If there exists more than one
 * solution you can return any of them.If there is no such string you have to return “NO SOLUTION”. If your returned
 * value is correct the program will print ‘CORRECT’ else ‘INCORRECT’.
 * If we are given a string "aabb", then the possible solutions are:
 * (i) abab
 * (ii) baba
 * We can see no two adjacent characters are the same in both strings.
 * So both (i) and (ii) are valid solutions.
 */
public class RearrangeAdjacentNoSameChar {

    public static void main(String[] args) {
        String ms = "aabb";
        ms = "aac";
        ms = "azzz";
//        ms = "abbc";
//        ms = "xyz";
        ms = "aaudomdoa";
        ms = reArrangeNoAdjacent(MapUtil.countChar(ms), ms);
        System.out.println(ms);
    }

    public static String reArrangeNoAdjacent(Map<Character, Integer> map, String ms) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        map.forEach((k, v) -> priorityQueue.add(new Pair(k, v)));

        // Frequency sorted in descending order if the highest frequency is one its mean that a char max
        // frequency is 1 and no need to change string
        int value = priorityQueue.peek().getFrequency();
        if (value==1) {
            return ms;
        }

        // If number of characters is higher than the half of length of the string then it not possible
        // that adjacent char not same
        if (value > (ms.length() + 1)/2) {
            return "NO SOLUTION";
        }
        StringBuilder sb = new StringBuilder();
        Pair prev = new Pair('-', 0);
        while (priorityQueue.size()>0) {
            Pair current = priorityQueue.poll();
            sb.append(current.getCharacter());
            if (prev.getFrequency()>0) {
                priorityQueue.add(prev);
            }
            current.setFrequency(current.getFrequency()-1);
            prev = current;
        }
        return sb.toString();
    }
}

