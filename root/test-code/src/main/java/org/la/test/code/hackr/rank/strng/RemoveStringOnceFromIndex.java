package org.la.test.code.hackr.rank.strng;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also
    valid if he can remove just  character at  index in the string, and the remaining characters will occur the same
    number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.
    Example
    s=abc
    This is a valid string because frequencies are {a:1, b:1, c:1}.
    s=abcc
    This is a valid string because we can remove one c and have 1 of each character in the remaining string.
    s=abccc
    This string is not valid as we can only remove 1 occurrence of c. That leaves character frequencies of
    {a:1, b:1, c:2}.
 */
public class RemoveStringOnceFromIndex {
    static final String yes = "YES";
    static final String no = "NO";

    public static void main(String[] args) {
        String res = isValid("zzaabbccddeefff");
        res = isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");
        System.out.println(res);
    }

    public static String isValid(String s) {

        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freq = charFreqMap.getOrDefault(c, 0);
            charFreqMap.put(c, ++freq);
        }
        if (charFreqMap.size()==1) {
            return yes;
        }
        int[] charCountArr = new int[charFreqMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> charIntEntry : charFreqMap.entrySet()) {
            charCountArr[index++] = charIntEntry.getValue();
        }
        Arrays.sort(charCountArr);
        int first = charCountArr[0];
        int second = charCountArr[1];
        int secondLast = charCountArr[charCountArr.length-2];
        int last = charCountArr[charCountArr.length-1];
        if(first==last) {
            return yes;
        }
        if(first==1 && second==last) {
            return yes;
        }
        if(first==secondLast && secondLast==last-1) {
            return yes;
        }
        return no;
    }
}
