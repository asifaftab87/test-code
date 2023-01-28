package org.la.test.code.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/*
 * 141. Linked List Cycle
 * URL: https://leetcode.com/problems/linked-list-cycle/description/
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is
 * a valid dictionary word. Return all such possible sentences in any order.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 */
public class HasCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();
        while (temp != null) {
            if (!set.add(temp)) {
                return true;
            }
        }
        return true;
    }
}
