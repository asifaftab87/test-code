package org.la.test.code.hackr.rank.easy.warmup;

public class CountingValleys {
    public static void main(String[] args) {
        int res = countingValleys(8, "UDDDUDUU");
        System.out.println(res);
    }
    public static int countingValleys(int steps, String path) {
        int numOfValleys = 0;
        int level = 0;
        for (int i=0 ; i<steps ; i++) {
            if(path.charAt(i)=='U') {
                level++;
            } else if(path.charAt(i)=='D') {
                if(level==0) {
                    numOfValleys++;
                }
                level--;
            }
        }
        return numOfValleys;
    }
}
