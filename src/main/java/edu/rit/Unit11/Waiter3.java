package edu.rit.Unit11;

public class Waiter3 implements Runnable {

    private final Object lock;

    public Waiter3(Object lock) {
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
        Waiter3 waiter = new Waiter3(lock);
        Thread t = new Thread(waiter);
        t.start();
        synchronized (lock){
            lock.notify();
        }
        System.out.println("Thread started.");
    }
}
