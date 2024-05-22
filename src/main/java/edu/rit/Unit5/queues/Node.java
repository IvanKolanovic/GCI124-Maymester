package edu.rit.Unit5.queues;

public class Node {
    private String value;
    private Node nextNode;

    public Node() {
        this.value = "Empty";
        this.nextNode = null;
    }
    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(this.nextNode==null) return this.value;
        else return this.value + " --> " + this.nextNode;
    }

    public Node(String value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public String getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
