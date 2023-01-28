package org.la.test.code.graph.free.code.camp.trie;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word) {
        TrieNode current = root;
        int len = word.length();
        for (int i=0; i<len; i++) {
            char ch = word.charAt(i);
            if (current.map.get(ch) == null) {
                TrieNode node = new TrieNode();
                current.map.put(ch, node);
                if (i+1 == len) {
                    current.isWord = true;
                }
                current = node;
            } else {
                current = current.map.get(ch);
            }
        }
//        current.isWord = true;
    }

    public void display(TrieNode current, StringBuilder sb) {
        for (Character key: current.map.keySet()) {
            sb.append(key);
            if (current.isWord) {
                System.out.println(sb);
            }
            display(current.map.get(key), sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
