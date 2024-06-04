package edu.rit.Unit10.threads;

import java.util.Scanner;

public class Counters2 {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num characters: ");
        int num = in.nextInt();
        in.close();

        Thread[] counters = new Thread[num];

        for (int i = 0; i < num; i++) {
            Runnable counter = new RunnableCounter("Counter " + i);
            counters[i] = new Thread(counter);
            counters[i].start();
        }

        for (Thread counter : counters) {
            counter.join();
        }
    }
}
