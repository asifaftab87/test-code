package org.la.test.code.live.intrv.ninja.van;

public class TruckWithDriversCombinations {

    static long calculateCombination(int nTruck) {
        long sum = 0l;
        int numOfTwos = 0;
        int n = nTruck;
        while (2*numOfTwos < nTruck) {
            sum += factorial(n)/(factorial(numOfTwos)*factorial(n-numOfTwos));
            numOfTwos++;
            n--;
        }
        if(numOfTwos*2==nTruck) {
            sum++;
        }
        return sum;
    }

    static long factorial(int n) {
        long f = 1;
        while (n>1) {
            f = f * n;
            n--;
        }
        return f;
    }
    public static void main(String[] args) {
        long res = calculateCombination(7);
        System.out.println("Total combination: "+res);
    }
}
