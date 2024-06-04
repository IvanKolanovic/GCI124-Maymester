package edu.rit.Unit10.threads;

public class Countdown implements Runnable {
    @Override
    public void run() {
        int i = -10;
        String header = "T";
        while (true) {
            if (i == 0) {
                System.out.println("Liftoff");
                break;
            } else
                System.out.println(header + i);

            try {
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Countdown()).start();
    }
}
