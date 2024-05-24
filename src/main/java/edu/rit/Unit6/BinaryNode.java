package edu.rit.Unit6;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode() {
        this.value = 0;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(int value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(int value) {
        this(value, null, null);
    }


    public String infixTraversal() {
        String result = "";

        if (this.left != null) {
            result += this.left.infixTraversal();
        }
        result += this.value + " ";

        if (this.right != null) {
            result += this.right.infixTraversal();
        }

        return result;
    }

    public boolean search(int target) {

        if (target == value)
            return true;

        boolean result = false;
        if (left != null)
            result = left.search(target);

        if (!result && right != null)
            result = right.search(target);

        return result;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value= " + value +
                ", left= " + left +
                ", right= " + right +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(2);

        // root children
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node7 = new BinaryNode(7);
        root.setLeft(node3);
        root.setRight(node7);

        // node3 children
        BinaryNode node9 = new BinaryNode(9);
        BinaryNode node4 = new BinaryNode(4);
        node3.setLeft(node9);
        node3.setRight(node4);

        // node7 children
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node6 = new BinaryNode(6);
        node7.setLeft(node1);
        node7.setRight(node6);


        System.out.println(root);
        System.out.println(root.infixTraversal());
        System.out.println(root.search(22));
    }

}
