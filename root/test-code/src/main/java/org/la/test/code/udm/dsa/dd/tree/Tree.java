package org.la.test.code.udm.dsa.dd.tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if(root==null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if(subtreeRoot==null) {
            return subtreeRoot;
        }
        if(value<subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value>subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            if(subtreeRoot.getLeftChild()==null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild()==null) {
                return subtreeRoot.getLeftChild();
            }
            //case 3: node to delete has two children
            //replace the value in the subtreeroot node with the smallest value
            //from right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //Delete the node that has smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    public void traverseInOrder() {
        if(root!=null) {
            root.traverseInOrder();
        } else {
            System.out.println("Tree is empty");
        }
    }

    public void traversePreOrder() {
        if(root!=null) {
            root.traversePreOrder();
        } else {
            System.out.println("Tree is empty");
        }
    }
    public TreeNode get(int value) {
        if(root!=null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return root.max();
    }
    @Override
    public String toString() {
        return root+"";
    }
}
