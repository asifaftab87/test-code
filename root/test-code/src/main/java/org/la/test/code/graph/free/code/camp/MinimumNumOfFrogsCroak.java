package org.la.test.code.graph.free.code.camp;

/*
    url: https://leetcode.com/problems/minimum-number-of-frogs-croaking/
    Minimum number of frogs croaking
    You are given the string croakOfFrogs, which represents a combination of the string "croak" from different frogs,
    that is, multiple frogs can croak at the same time, so multiple "croak" are mixed.
    Return the minimum number of different frogs to finish all the croaks in the given string.
    A valid "croak" means a frog is printing five letters 'c', 'r', 'o', 'a', and 'k' sequentially. The frogs have to
    print all five letters to finish a croak. If the given string is not a combination of a valid "croak" return -1.
 */
public class MinimumNumOfFrogsCroak {

    public static int minNumberOfFrogs(String croakOfFrogs) {
        int c = 0, r = 0, o = 0, a = 0, k = 0, ans = -1, numOfActiveFrogs = 0;
        for (char ch: croakOfFrogs.toCharArray()) {
            switch (ch) {
                case 'c' :
                    c++;
                    numOfActiveFrogs++;
                    break;
                case 'r' :
                    r++;
                    break;
                case 'o' :
                    o++;
                    break;
                case 'a' :
                    a++;
                    break;
                case 'k' :
                    k++;
                    numOfActiveFrogs--;
                    break;
            }
            if (c<r || r<o || o<a || a<k) {
                return -1;
            }
            ans = Math.max(ans, numOfActiveFrogs);
        }
        return numOfActiveFrogs == 0 ? ans : -1;
    }

    public static void main(String[] args) {
        System.out.println("num of frogs: "+minNumberOfFrogs("croakcroak"));
    }
}
