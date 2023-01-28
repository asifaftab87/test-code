package org.la.test.code.leetcode.problems;

import java.util.Arrays;
import java.util.List;

/*
 * 139. Word Break
 * URL: https://leetcode.com/problems/word-break/description/
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated
 * sequence of one or more dictionary words.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return wordBreak(s, wordDict, 0, dp);
    }

    public boolean wordBreak(String s, List<String> wordDict, int pos, Boolean[] dp) {
        if (pos == s.length()) {
            return true;
        }
        if (dp[pos] != null) {
            return dp[pos];
        }
        for (String word: wordDict) {
            if (s.startsWith(word, pos) && wordBreak(s, wordDict, pos + word.length(), dp)) {
                dp[pos] = true;
                return true;
            }
        }
        dp[pos] = false;
        return false;
    }

    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
        String s = "catsandog";
        boolean res = new WordBreak().wordBreak(s, wordDict);
        System.out.println("Result: " + res);
    }
}
