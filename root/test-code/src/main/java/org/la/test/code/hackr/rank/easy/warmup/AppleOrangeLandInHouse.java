package org.la.test.code.hackr.rank.easy.warmup;

import java.util.Arrays;
import java.util.List;

/*
    Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below,
    determine the number of apples and oranges that land on Sam's house.
    The red region denotes the house, where  is the start point, and  is the endpoint. The apple tree is to the left of
    the house, and the orange tree is to its right. Assume the trees are located on a single point, where the apple tree
    is at point , and the orange tree is at point. When a fruit falls from its tree, it lands  units of distance from
    its tree of origin along the -axis. *A negative value of  means the fruit fell  units to the tree's left, and a
    positive value of  means it falls  units to the tree's right. *
    Sample Input 0
        7 11
        5 15
        3 2
        -2 2 1
        5 -6
    Sample Output 0
        1
        1
 */
public class AppleOrangeLandInHouse {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long sumApple = 0, sumOrange = 0;
        for (int apple : apples) {
            if (apple>0 && a+apple>=s && a+apple<=t) {
                sumApple++;
            }
        }
        for (int orange : oranges) {
            if (orange<0 && b+orange>=s && b+orange<=t) {
                sumOrange++;
            }
        }
        System.out.println(sumApple);
        System.out.println(sumOrange);
    }

    public static void main(String[] args) {
        int s = 7, t = 11, a = 5, b = 15;
        List<Integer> apples = Arrays.asList(-2, 2, 1);
        List<Integer> oranges = Arrays.asList(5, -6);
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
