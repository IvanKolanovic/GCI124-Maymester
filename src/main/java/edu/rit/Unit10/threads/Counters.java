package edu.rit.Unit10.threads;

import java.util.Scanner;

public class Counters {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num characters: ");
        int num = in.nextInt();
        in.close();

        for (int i = 0; i < num ; i++) {
            Runnable counter = new RunnableCounter("Counter "+ i);
            Thread countThread = new Thread(counter);
            countThread.start();
            countThread.join();
        }

        System.out.println("All done");
    }
}
