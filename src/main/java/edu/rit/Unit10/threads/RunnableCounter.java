package edu.rit.Unit10.threads;

public class RunnableCounter implements Runnable {
    private String name;


    public RunnableCounter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int count = 1;
        while (count < 101) {
            System.out.println(name + ": " + count);
            count++;
        }
    }
}
