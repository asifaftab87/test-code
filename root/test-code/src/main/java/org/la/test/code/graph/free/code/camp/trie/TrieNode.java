package org.la.test.code.graph.free.code.camp.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    public Map<Character, TrieNode> map;
    public boolean isWord;

    public TrieNode() {
        map = new HashMap<>();
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
