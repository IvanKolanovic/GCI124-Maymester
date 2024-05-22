package edu.rit.Unit5.queues;

import java.util.Arrays;

public class ArrayQueue implements Queue {
    private String[] elements;
    private int front;
    private int back;
    private int size;

    public ArrayQueue() {
        this.elements = new String[5];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(String value) {
        if (size == elements.length) {
            this.resizeQueue();
        }

        elements[back] = value;
        back = (back + 1) % elements.length;
        size++;
    }

    private void resizeQueue() {
        String[] bigger = new String[elements.length * 2];
        for (int destination = 0; destination < size; destination++) {
            int source = (front + destination) % size;
            bigger[destination] = this.elements[source];
        }
        this.elements = bigger;
        this.front = 0;
        this.back = size;
    }

    @Override
    public String dequeue() {
        if (size == 0)
            return null;

        String value = this.elements[front];
        this.elements[this.front] = null;
        this.front = (this.front + 1) % this.elements.length;
        size--;
        return value;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "<" + this.elements.length + ">, <" + Arrays.toString(this.elements) + ">";
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("a");
        arrayQueue.enqueue("b");
        arrayQueue.enqueue("c");
        arrayQueue.enqueue("d");
        arrayQueue.enqueue("e");

        System.out.println(arrayQueue);
        System.out.println("Front: " + arrayQueue.front);
        System.out.println("Back: " + arrayQueue.back);

        arrayQueue.enqueue("f");

        System.out.println(arrayQueue);
        System.out.println("Front: " + arrayQueue.front);
        System.out.println("Back: " + arrayQueue.back);

//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.dequeue());
//
//        System.out.println(arrayQueue);
//        System.out.println("Front: " + arrayQueue.front);
//        System.out.println("Back: " + arrayQueue.back);
//
//        arrayQueue.enqueue("f");
//
//        System.out.println(arrayQueue);
//        System.out.println("Front: " + arrayQueue.front);
//        System.out.println("Back: " + arrayQueue.back);

    }
}
