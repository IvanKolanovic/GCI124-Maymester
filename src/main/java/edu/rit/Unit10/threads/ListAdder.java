package edu.rit.Unit10.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListAdder implements Runnable {

    private final Vector<Integer> holder;
    private final int number;

    public ListAdder(Vector<Integer> holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            holder.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> holder = new Vector<>();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new ListAdder(holder, 50));
            threads[i].start();
        }
        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }

        System.out.println("Holder has " + holder.size());
    }
}
