package org.la.att.system.codility;

public class CountSetBit {
    public int solution(int a, int b){
        long prod = a * (long)b;
        int count = 0;
        for(int i=63 ; i>=0 ; i--){
            long res = prod>>i & 1l;
            System.out.print(res+" ");
            if((res)>0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountSetBit countSetBit = new CountSetBit();
        int res = countSetBit.solution(1000000000,1000000000);
        System.out.println("\n"+res);
    }
}
