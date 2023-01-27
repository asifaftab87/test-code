package org.la.test.code.graph.free.code.camp.trie;

import java.util.LinkedHashMap;
import java.util.Map;

public class TrieNode {

    public Map<Character, TrieNode> map;
    public boolean isWord;

    public TrieNode() {
        map = new LinkedHashMap<>();
        isWord = false;
    }

    @Override
    public String toString() {
        return "{" +
                "map: " + map +
                ", isWord: " + isWord +
                '}';
    }
}
