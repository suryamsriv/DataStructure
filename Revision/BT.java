package Revision;

import java.util.ArrayList;

import javax.sql.rowset.spi.TransactionalWriter;

public class BT {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value" + this.value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (node == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current.value != value) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    private boolean isEmpty() {
        return root == null;
    }

    public void traversePreOrder(Node root) {
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrdre(Node root) {
        traverseInOrdre(root.leftChild);
        System.out.println(root.value);
        traverseInOrdre(root.rightChild);
    }

    public void traversePostOrder(Node root) {
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public int min(Node root) {
        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    public int minBST(Node root) {
        if (root == null)
            throw new IllegalArgumentException();

        var current = root;
        var last = root;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }

        return last.value;
    }

    public boolean equals(BT other) {
        if (other == null)
            return false;
        equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBST(Node root) {
        return isBST(root, Number.MIN_VALUE, Number.MAX_VALUE);
    }

    private boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.value < min || root.value > max)
            return false;

        return isBST(root.leftChild, min, root.value - 1)
                && isBST(root.rightChild, root.value + 1, max);
    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, distance, list) {
        if(root == null)
            return;
        
        if(distance == 0)
        {
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.leftChild, distance - 1, list);
        getNodesAtDistance(root.rightChild, distance - 1, list);
    }

    public void traverseLevelOrder() {
        for (var i = 0; i < height(); i++) {
            for (var value : getNodesAtDistance(i)) {
                System.out.println(value);
            }
        }
    }
}
