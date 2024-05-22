package edu.rit.Unit5.generics;

public class GenericLinkedQueue<T> implements GenericQueue<T> {

    private GenericNode<T> head;
    private GenericNode<T> tail;
    private int size;

    public GenericLinkedQueue() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(T value) {
        GenericNode<T> node = new GenericNode<T>(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            GenericNode<T> oldTail = this.tail;
            oldTail.setNextNode(node);
            this.tail = node;
        }

        this.size++;
    }

    @Override
    public T dequeue() {
        if (size == 0)
            return null;
        T value = this.head.getValue();
        this.head = this.head.getNextNode();
        if (this.head == null) {
            this.tail = null;
        }
        this.size--;
        return value;
    }

    @Override
    public int size() {
        return this.size;
    }

    public GenericNode<T> getHead() {
        return head;
    }

    public void setHead(GenericNode<T> head) {
        this.head = head;
    }

    public GenericNode<T> getTail() {
        return tail;
    }

    public void setTail(GenericNode<T> tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Queue[" + this.size() + ", " + this.head + "]";
    }

    public static void main(String[] args) {
        GenericLinkedQueue<String> queue = new GenericLinkedQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");

        System.out.println(queue);
    }
}
