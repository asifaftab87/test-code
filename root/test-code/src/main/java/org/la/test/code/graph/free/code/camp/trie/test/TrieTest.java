package org.la.test.code.graph.free.code.camp.trie.test;

import org.junit.jupiter.api.Test;
import org.la.test.code.graph.free.code.camp.trie.Trie;

import static org.junit.Assert.assertTrue;

public class TrieTest {

    @Test
    public void one() {
        Trie trie = new Trie();
        trie.insert("anil");
        trie.insert("amit");
        trie.insert("akif");
//        trie.insert("ahnaf");
        trie.display(trie.getRoot(), new StringBuilder(""));
        assertTrue(true);
    }
}
