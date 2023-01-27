package org.la.test.code.strng;

import org.la.test.code.util.StringUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringSpecialCharIntact {

    public String reverseStringSpecialCharIntact(String src) {
        Character[] arr = src.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.toList()).toArray(new Character[]{0});
        int len = arr.length;
        for (int start=0, end=len-1; start<end;) {
            boolean startIsAlphaNumeric = isAlphaNumeric(arr[start]);
            boolean endIsAlphaNumeric = isAlphaNumeric(arr[end]);
            if (!startIsAlphaNumeric) {
                start++;
            }
            if (!endIsAlphaNumeric) {
                end--;
            }
            if (startIsAlphaNumeric && endIsAlphaNumeric) {
                StringUtil.swap(arr, start++, end--);
            }
        }
        return Arrays.stream(arr).map(x -> x.toString()).collect(Collectors.joining());
    }

    public boolean isAlphaNumeric(char c) {
        if ((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9')) {
            return true;
        }
        return false;
    }
}
