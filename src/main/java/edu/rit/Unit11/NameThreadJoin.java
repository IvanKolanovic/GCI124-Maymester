package edu.rit.Unit11;

public class NameThreadJoin implements Runnable {

    private String threadName;
    private String name;
    private int index;
    private Thread previous;

    public NameThreadJoin(Thread previous, String threadName, String name, int index) {
        this.threadName = threadName;
        this.name = name;
        this.index = index;
        this.previous = previous;
    }

    @Override
    public void run() {
        if (previous != null) {
            try {
                previous.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(this.threadName + ": " + name.charAt(index));
    }

    public static void main(String[] args) {
        String name = "Tomislav";
        Thread previous = null;
        for (int i = 0; i < name.length(); i++) {
            NameThreadJoin nt = new NameThreadJoin(previous, "T" + i, name, i);
            previous = new Thread(nt);
            previous.start();
        }
    }
}
