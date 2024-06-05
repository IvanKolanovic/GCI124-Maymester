package edu.rit.Unit11;

import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable {
    private static final Random RNG = new Random(1);
    private int id;
    private final LinkedList<String> queue;


    public Producer(int id, LinkedList<String> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        int messageNumber = 1;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int numberOfMessages = RNG.nextInt(4) + 1;
            synchronized (queue) {
                for (int i = 0; i < numberOfMessages; i++) {
                    String message = "Producer " + id + ": message #" + messageNumber;
                    queue.add(message);
                    messageNumber++;
                }
                queue.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            Consumer2 consumer = new Consumer2(queue, i);
            Thread thread = new Thread(consumer);
            thread.start();
        }

        for (int i = 0; i < 2; i++) {
            Producer producer = new Producer(i, queue);
            Thread thread = new Thread(producer);
            thread.start();
        }
    }
}
