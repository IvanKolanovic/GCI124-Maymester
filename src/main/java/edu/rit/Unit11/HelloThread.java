package edu.rit.Unit11;

import java.util.ArrayList;
import java.util.List;

public class HelloThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        List<Thread> lt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            HelloThread helloRunnable = new HelloThread();
            Thread t = new Thread(helloRunnable);
            t.start();
            lt.add(t);
        }

        for (Thread thread : lt) {
            thread.join();
        }

        System.out.println("End");

    }
}
