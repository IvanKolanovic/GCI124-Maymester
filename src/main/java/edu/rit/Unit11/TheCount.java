package edu.rit.Unit11;

public class TheCount implements Runnable {

    private static final int[] COUNT = new int[1];
    private final int id;

    public TheCount(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Counter " + id + " is starting.");
        for (int i = 0; i < 100000; i++) {
            synchronized (COUNT) {
                COUNT[0] = COUNT[0] + 1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            TheCount tc = new TheCount(i);
            Thread t = new Thread(tc);
            t.start();
        }

        Thread.sleep(1000);
        System.out.println(COUNT[0]);
    }
}
