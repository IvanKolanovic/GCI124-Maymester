package edu.rit.Unit10.threads;

public class CounterThread extends Thread {

    private final String name;

    public CounterThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(this.name + ": " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CounterThread("Counter 1");
        thread.start();
        int count = 0;
        while (thread.isAlive()){
            count++;
        }
        System.out.println("Counting finished.");

        for(char ch='A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }

        System.out.println("");
        System.out.println("Total busy wait: " + count);
    }
}
