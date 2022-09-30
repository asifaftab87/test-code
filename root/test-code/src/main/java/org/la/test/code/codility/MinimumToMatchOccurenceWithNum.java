package org.la.test.code.codility;

public class MinimumToMatchOccurenceWithNum {
    public int solution(int[] a) {
        int l = a.length;
        int minMove = 0;
        for (int i=0 ; i<l ; i++) {
            int count = 0;
            for(int j=i ; j<l && a[i]==a[j] ; j++) {
                if(a[j]==a[i]) {
                    count++;
                }
                i = j;
            }
            int diff = Math.abs(a[i]-count);
            minMove += Math.min(count, diff);
        }
        return minMove;
    }

    public static void main(String[] args) {
        MinimumToMatchOccurenceWithNum mm = new MinimumToMatchOccurenceWithNum();
        int[] a = {1,1,3,4,4,4};
        a = new int[]{1,2,2,2,5,5,5,8};
        a = new int[]{1,1,1,1, 3,3,4,4,4,4,4};
        a = new int[]{10,10,10};
        int minMove = mm.solution(a);
        System.out.println(minMove);
    }
}
