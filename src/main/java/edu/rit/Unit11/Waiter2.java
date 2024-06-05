package edu.rit.Unit11;

public class Waiter2 implements Runnable {

    private final Object lock;

    public Waiter2(Object lock) {
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


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Waiter2 waiter = new Waiter2(lock);
        Thread t = new Thread(waiter);
        t.start();
        Thread.sleep(1000);
        synchronized (lock){
            lock.notify();
        }
        System.out.println("Thread started.");
    }
}
