package org.la.test.code.udm.dsa.dd.tree;

public class TreeNode {
    private int data;
    private TreeNode rightChild;
    private TreeNode leftChild;
    public TreeNode(int d) {
        data = d;
    }

    public void insert(int value) {
        if(value==data) {
            return;
        }
        if(value<data) {
            if(leftChild==null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if(rightChild==null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (leftChild!=null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data+", ");
        if (rightChild!=null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(data+", ");
        if (leftChild!=null) {
            leftChild.traversePreOrder();
        }
        if (rightChild!=null){
            rightChild.traversePreOrder();

        }
    }

    public TreeNode get(int value) {
        if(data==value) {
            return this;
        }
        if(value<data) {
            if (leftChild!=null) {
                return leftChild.get(value);
            }
        } else {
            if(rightChild!=null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min() {
        if(leftChild==null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if(rightChild==null) {
            return data;
        } else {
            return rightChild.max();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return data+"";
    }
}
