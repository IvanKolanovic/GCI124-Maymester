package edu.rit.Unit5.queues;

public interface Queue {
    void enqueue(String value);

    String dequeue();

    int size();
}
