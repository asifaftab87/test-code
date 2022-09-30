package org.la.test.code.hackr.rank.strng;

public class RemoveSameAdjacentCharacter {
    public static void main(String[] args) {
        int res = alternatingCharacters("aaaaaaaccccccbvvvvvvvvvb");
        System.out.println(res);
    }

    public static int alternatingCharacters(String s) {
        char ref = s.charAt(0);
        int count = 0;
        for(int i=1 ; i<s.length() ; i++) {
            if(ref!=s.charAt(i)) {
                ref = s.charAt(i);
            } else {
                count++;
            }
        }
        return count;
    }
}
