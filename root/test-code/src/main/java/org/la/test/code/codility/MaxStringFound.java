package org.la.test.code.codility;

public class MaxStringFound {

    public static void main(String[] args) {
        MaxStringFound msf = new MaxStringFound();
        String ms = "ABCDXYZ";
//        ms = "BILLOBILLOLLOBBI";
        ms = "CAT";
        String[] arr = {"ABCD", "XYZ"};
//        arr = new String[] {"BILL", "BOB"};
        arr = new String[] {"ILOVEMYDOG", "CATS"};
        int result = msf.solution(arr, ms);
        System.out.println(result);
    }

    public int solution(String[] arr, String ms) {
        int max = 0;
        for (String ls : arr) {
            int count = subStringProcess(ls, ms);
            if (max < count) {
                max = count;
            }
        }
        return max;
    }

    int subStringProcess(String s, String ms) {
        char[] arr = s.toCharArray();
        char[] mArr = ms.toCharArray();
        int max = 0;
        boolean breakInfiniteLoop = false;
        while (true) {
            int count = 0;
            int n = 0;
            for (; n<arr.length ; n++) {
                int i = 0;
                for (; i < mArr.length; i++) {
                    if (arr[n] == mArr[i]) {
                        mArr[i] = '-';
                        break;
                    }
                }
                if (i == mArr.length) {
                    breakInfiniteLoop = true;
                    break;
                }
            }
            if (breakInfiniteLoop) {
                break;
            }
            max++;
        }
        return max;
    }

}
