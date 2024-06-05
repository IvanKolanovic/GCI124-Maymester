package edu.rit.Unit11;

import java.util.LinkedList;

public class Consumer implements Runnable {
    private LinkedList<String> queue;
    private int id;

    public Consumer(LinkedList<String> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        synchronized (queue) {
            while (true) {
                while (!queue.isEmpty()) {
                    String message = queue.remove(0);
                    System.out.println(id + ": " + message);
                }
                System.out.println(id + " waiting for work...");
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("First message");
        queue.add("Second message");
        Consumer consumer = new Consumer(queue, 0);
        Thread thread = new Thread(consumer);
        thread.start();
        Thread.sleep(1000);
        synchronized (queue){
            queue.add("Third message");
            queue.notify();
        }
    }
}
