package org.la.test.code.hackr.rank.singtel.array;

import java.util.Collections;
import java.util.List;

public class ArraySetSingtel {

    public List<Integer> biggerArray(List<Integer> list) {
        Collections.sort(list);
        int size = list.size();
        int meetingPoint = -1;
        if (size < 10) {
            meetingPoint = (size + 1) / 2;
        } else {
            meetingPoint = size * 63 / 100 + 1;
        }
        int smallSum = list.subList(0, meetingPoint).stream().reduce(0, Integer::sum);
        int largeSum = list.subList(meetingPoint, size).stream().reduce(0, Integer::sum);
        System.out.println("smallSum: " + smallSum);
        System.out.println("largeSum: " + largeSum);
        System.out.println("element1 : " + meetingPoint + ",  element2: " + (size-meetingPoint));
        System.out.println("original : " + list);
        if (largeSum > smallSum) {
            return shiftRight(list, smallSum, largeSum, meetingPoint);
        }
        return leftShift(list, smallSum, largeSum, meetingPoint);
    }

    public List<Integer> shiftRight(List<Integer> list, int smallSum, int largeSum, int meetingPoint) {
        int start = meetingPoint;
        int element = list.get(start++);
        int tempSmallSum = smallSum + element;
        int tempLargeSum = largeSum - element;
        while (tempLargeSum - tempSmallSum > 0) {
            element = list.get(start++);
            tempSmallSum = tempSmallSum + element;
            tempLargeSum = tempLargeSum - element;
        }
        System.out.println("lsize: " + (list.size() - start) + ", ssize: " + start);
        System.out.println("tempLargeSum: " + tempLargeSum + ", tempSmallSum: " + tempSmallSum);
        return list.subList(start-1, list.size());
    }

    public List<Integer> leftShift(List<Integer> list, int smallSum, int largeSum, int meetingPoint) {
        int start = meetingPoint - 1;
        int element = list.get(start--);
        int tempSmallSum = smallSum - element;
        int tempLargeSum = largeSum + element;
        while (tempLargeSum - tempSmallSum <= 0) {
            element = list.get(start--);
            tempSmallSum = tempSmallSum - element;
            tempLargeSum = tempLargeSum + element;
        }
        System.out.println("lsize: " + (list.size() - start) + ", ssize: " + start);
        System.out.println("tempLargeSum: " + tempLargeSum + ", tempSmallSum: " + tempSmallSum);
        return list.subList(start+1, list.size());
    }
}
