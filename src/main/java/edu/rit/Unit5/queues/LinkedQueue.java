package edu.rit.Unit5.queues;

public class LinkedQueue implements Queue {

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void enqueue(String value) {
        Node node = new Node(value);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            Node oldTail = this.tail;
            oldTail.setNextNode(node);
            this.tail = node;
        }

        this.size++;
    }

    @Override
    public String dequeue() {
        if (size == 0)
            return null;
        String value = this.head.getValue();
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

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Queue[" + this.size() + ", " + this.head + "]";
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("D");
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
