package edu.rit.Unit6;

public class NodeBST {
    // root node
    private BinaryNode node;
    private int size;

    public NodeBST() {
        this.node = null;
        this.size = 0;
    }

    public NodeBST(int rootValue) {
        this.node = new BinaryNode(rootValue);
        this.size = 1;
    }

    public void insert(int value) {
        if (this.node == null)
            this.node = new BinaryNode(value);
        else
            binaryInsert(this.node, value);

        this.size++;
    }


    private void binaryInsert(BinaryNode node, int value) {
        if (value < node.getValue()) {
            // left subtree
            BinaryNode left = node.getLeft();
            if (left != null) {
                binaryInsert(left, value);
            } else {
                left = new BinaryNode(value);
                node.setLeft(left);
            }
        } else {
            BinaryNode right = node.getRight();
            if (right != null) {
                binaryInsert(right, value);
            } else {
                right = new BinaryNode(value);
                node.setRight(right);
            }
        }
    }


    @Override
    public String toString() {
        return node != null ? node.infixTraversal() : "<empty>";
    }

    public BinaryNode getNode() {
        return node;
    }

    public void setNode(BinaryNode node) {
        this.node = node;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        NodeBST bst = new NodeBST();
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(6);
        bst.insert(7);
        bst.insert(3);

        System.out.println(bst);

    }
}
