package edu.rit.Unit5.generics;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class GenericArrayQueue<T> implements GenericQueue<T> {
    private Object[] elements;
    private int front;
    private int back;
    private int size;

    public GenericArrayQueue() {
        this.elements = new Object[5];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(T value) {
        if (size == elements.length) {
            this.resizeQueue();
        }

        elements[back] = value;
        back = (back + 1) % elements.length;
        size++;
    }

    private void resizeQueue() {
        Object[] bigger = new Object[elements.length * 2];
        for (int destination = 0; destination < size; destination++) {
            int source = (front + destination) % size;
            bigger[destination] = this.elements[source];
        }
        this.elements = bigger;
        this.front = 0;
        this.back = size;
    }

    @Override
    public T dequeue() {
        if (size == 0)
            return null;

        T value = (T) this.elements[front];
        this.elements[this.front] = null;
        this.front = (this.front + 1) % this.elements.length;
        size--;
        return value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return "<" + this.elements.length + ">, <" + Arrays.toString(this.elements) + ">";
    }

    public static void main(String[] args) {
        GenericArrayQueue<String> arrayQueue = new GenericArrayQueue();

        arrayQueue.enqueue("a");
        arrayQueue.enqueue("b");
        arrayQueue.enqueue("c");
        GenericArrayQueue<Integer> newQueue = new GenericArrayQueue();
        newQueue.enqueue(2);
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
