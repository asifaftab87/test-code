package org.la.test.code.ninja;

/*
 * URL:
 * https://www.codingninjas.com/codestudio/problems/two-substrings_920397?topList=top-amazon-coding-interview-questions
 * Anish is given a string S and has been asked to determine if the given string S contains two non-overlapping
 * substrings "AB" and "BA" (the substrings can go in any order).
 * As a friend of Anish, your task is to return “True” if the string S contains two non-overlapping substrings "AB"
 * and "BA" (the substrings can go in any order) otherwise return “False” (without quotes).
 */
public class FindOverlap {

    public static void main(String[] args) {
        System.out.println("main : "+findOverlap("AB"));
    }

    public static boolean findOverlap(String s) {
        String[] arr = {"AB", "BA"};
        for (int i = 0; i < arr.length; i++) {
            int ind = s.indexOf(arr[i]);
            if (ind == -1) {
                return false;
            }
            s = s.substring(0, ind) + s.substring(ind + 2);
        }
        return true;
    }
}
