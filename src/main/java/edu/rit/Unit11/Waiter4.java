package edu.rit.Unit11;

public class Waiter4 implements Runnable {

    private final Object lock;

    public Waiter4(Object lock) {
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

        for (int i = 0; i < 10; i++) {
            Waiter4 waiter = new Waiter4(lock);
            Thread t = new Thread(waiter);
            t.start();
        }
        Thread.sleep(1000);
        synchronized (lock){
            lock.notifyAll();
            System.out.println("Threads notified.");
        }
    }
}
