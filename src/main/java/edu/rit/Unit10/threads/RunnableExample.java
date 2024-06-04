package edu.rit.Unit10.threads;

public class RunnableExample implements Runnable{

    private int id;

    public RunnableExample(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id);
    }

    public static void main(String[] args) {
//        Runnable runnableExample = new RunnableExample(1);
//        Thread exampleThread = new Thread(runnableExample);
//        exampleThread.start();
        Runnable counter = new RunnableCounter("Runnable 1");
        Thread thread = new Thread(counter);
        thread.start();

    }
}
