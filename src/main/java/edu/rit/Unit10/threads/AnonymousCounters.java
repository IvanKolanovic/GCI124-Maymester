package edu.rit.Unit10.threads;

public class AnonymousCounters {

    private static void counter(String name) {
        int count = 1;
        while (count < 101) {
            System.out.println(name + ": " + count);
            count++;
        }
    }

    public static void main(String[] args) {

        int num = 20;
        for (int i = 0; i < num; i++) {
            Thread thread = null;
            String name = "Counter " + i;
            if (i % 2 == 0) {
                thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        counter(name);
                    }
                });

            } else {
                thread = new Thread(() -> counter(name));
            }

            thread.start();
        }
    }
}
