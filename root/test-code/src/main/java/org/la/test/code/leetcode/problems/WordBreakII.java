package org.la.test.code.leetcode.problems;

import java.util.*;

/*
 * 140. Word Break II
 * URL: https://leetcode.com/problems/word-break-ii/description/
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is
 * a valid dictionary word. Return all such possible sentences in any order.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 */
public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> memo = new HashMap();
        return dfs(s, 0, wordDict, memo);
    }

    private List<String> dfs(String s, Integer start, List<String> wordDict, Map<Integer, List<String>> memo) {
        if (memo.get(start) != null) {
            return memo.get(start);
        }
        List<String> ans = new LinkedList();
        if (start == s.length()) {
            ans.add("");
            return ans;
        }
        for (String word: wordDict) {
            for (int end = start + 1; end <= s.length(); end++) {
                String w = s.substring(start, end);
                if (word.equals(w)) {
                    List<String> list = dfs(s, end, wordDict, memo);
                    for (String str: list) {
                        String seq = word + (str.length() > 0 ? " " : "") + str;
                        ans.add(seq);
                    }
                }
            }
        }
        memo.put(start, ans);
        return ans;
    }
}
