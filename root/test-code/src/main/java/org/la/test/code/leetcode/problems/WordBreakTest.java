package org.la.test.code.leetcode.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {

    WordBreak wordBreak = new WordBreak();
    WordBreakII wordBreak2 = new WordBreakII();
    WordBreakIIME wordBreak3 = new WordBreakIIME();

    @Test
    void wordBreakIIOneME() {
        List<String>  list = wordBreak3.wordBreak("catsanddog", Arrays.asList("cats","dog","sand","and","cat"));
//        assertFalse(wordBreak2.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
        System.out.println(list);
        assertTrue(true);
    }

    @Test
    void wordBreakIIOne() {
        List<String>  list = wordBreak2.wordBreak("catsanddog", Arrays.asList("cats","dog","sand","and","cat"));
//        assertFalse(wordBreak2.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
        System.out.println(list);
        assertTrue(true);
    }

    @Test
    void one() {
        assertFalse(wordBreak.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }

    @Test
    void two() {
        assertTrue(wordBreak.wordBreak("leetcode", Arrays.asList("leet","code")));
    }

    @Test
    void three() {
        assertTrue(wordBreak.wordBreak("applepenapple", Arrays.asList("apple","pen")));
    }

    @Test
    void four() {
        assertTrue(wordBreak.wordBreak("bb", Arrays.asList("a","b","bbb","bbbb")));
    }

    @Test
    void five() {
        assertFalse(wordBreak.wordBreak("aaaaaaa", Arrays.asList("aaaa","aa")));
    }

}
