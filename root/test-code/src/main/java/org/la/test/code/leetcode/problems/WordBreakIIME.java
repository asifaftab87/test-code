package org.la.test.code.leetcode.problems;

import java.util.*;

/*
 * 140. Word Break II
 * URL: https://leetcode.com/problems/word-break-ii/description/
 * More efficient
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is
 * a valid dictionary word. Return all such possible sentences in any order.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 */
public class WordBreakIIME {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        dfs(s, wordDict, result, new ArrayList<String>());
        return result;
    }

    private void dfs(String s, List<String> dict, List<String> res, List<String> tmp) {
        if (s.length() == 0) {
            StringBuilder sb = new StringBuilder();
            for (String w: tmp) {
                sb.append(w).append(" ");
            }
            res.add(sb.toString().trim());
            return;
        }
        for (String w: dict) {
            if (s.startsWith(w)) {
                tmp.add(w);
                dfs(s.substring(w.length()), dict, res, tmp);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
