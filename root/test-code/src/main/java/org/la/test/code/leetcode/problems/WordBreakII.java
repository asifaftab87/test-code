package org.la.test.code.leetcode.problems;

import java.util.*;

public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        Map<Integer, String> map = new HashMap<>();
        wordBreak(s, wordDict, 0, dp, map);
        System.out.println(Arrays.toString(dp));
        System.out.println(map);
        List<String> result = new ArrayList<>();
        return result;
    }

    public boolean wordBreak(String s, List<String> wordDict, int pos, Boolean[] dp, Map<Integer, String> map) {
        if (pos == s.length()) {
            return true;
        }
        if (dp[pos] != null) {
            return dp[pos];
        }
        for (String word: wordDict) {
            if (s.startsWith(word, pos) && wordBreak(s, wordDict, pos+word.length(), dp, map)) {
                dp[pos] = true;
                map.put(pos, word);
                return true;
            }
        }
        dp[pos] = false;
        return false;
    }
}
