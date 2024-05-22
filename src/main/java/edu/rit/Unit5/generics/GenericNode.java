package edu.rit.Unit5.generics;

public class GenericNode<T> {
    private T value;
    private GenericNode<T> nextNode;

    public GenericNode() {
        this.value = null;
        this.nextNode = null;
    }

    public GenericNode(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public GenericNode(T value, GenericNode<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        if (this.nextNode == null) return null;
        else return this.value + " --> " + this.nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GenericNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(GenericNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
