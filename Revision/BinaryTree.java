package Revision;

import javax.lang.model.util.ElementScanner6;

public class BinaryTree {
    public class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node= " + this.value;
        }
    }

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int item) {
        var current = root;
        while (current.value != item) {
            if (item < current.value)
                current = current.leftChild;
            else if (item > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }
}
