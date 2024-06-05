package edu.rit.Unit11;

public class NameThread implements Runnable {

    private String threadName;
    private String name;
    private int index;

    public NameThread(String threadName, String name, int index) {
        this.threadName = threadName;
        this.name = name;
        this.index = index;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500L * index);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.threadName + ": " + name.charAt(index));
    }

    public static void main(String[] args) {
        String name = "Tomislav";
        for (int i = 0; i < name.length(); i++) {
            NameThread nt = new NameThread("T" + i, name, i);
            new Thread(nt).start();
        }
    }
}
