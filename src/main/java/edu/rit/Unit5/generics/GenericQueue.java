package edu.rit.Unit5.generics;

public interface GenericQueue<T> {

    void enqueue(T value);

    T dequeue();

    int size();
}
