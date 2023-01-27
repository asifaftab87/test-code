package org.la.test.code.ninja;

import java.util.Stack;

public class DeleteMiddle {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);  //83 74 67 49 94 8 11 1
        stack.push(83);
        stack.push(74);
        stack.push(67);
        stack.push(49);
        stack.push(94);
        stack.push(8);
        stack.push(11);
        stack.push(1);
        deleteMiddle(stack, 8);
        System.out.println(stack);
    }
    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        Stack<Integer> tempStack = new Stack<>();
        int mid = (N + 1) / 2 + (N%2==0 ? 1 : 0);
        for (int i=1; i<N; i++) {
            int ele = inputStack.pop();
            if (i>=mid) {
                break;
            }
            tempStack.push(ele);
        }
        while (!tempStack.isEmpty()) {
            inputStack.push(tempStack.pop());
        }
    }
}
