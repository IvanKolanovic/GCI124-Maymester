package edu.rit.Unit11;

import java.util.LinkedList;

public class Consumer2 implements Runnable {
    private final LinkedList<String> queue;
    private int id;

    public Consumer2(LinkedList<String> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            String message = null;
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println(id + " waiting for work...");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                message = queue.remove(0);
            }
            System.out.println("Consumer " + id + ": " + message);
        }
    }
}
