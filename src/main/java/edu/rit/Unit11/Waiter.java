package edu.rit.Unit11;

public class Waiter implements Runnable {

    private final Object lock;

    public Waiter(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Done waiting!");
        }
    }


    public static void main(String[] args) {
        Object lock = new Object();
        Waiter waiter = new Waiter(lock);
        Thread t = new Thread(waiter);
        t.start();
        System.out.println("Thread started.");
    }
}
