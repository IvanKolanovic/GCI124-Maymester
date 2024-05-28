package edu.rit.Unit9.anonymous;

import java.util.Iterator;

public class IterableString implements Iterable<String> {
    private String s;

    public IterableString(String s) {
        this.s = s;
    }

    @Override
    public Iterator<String> iterator() {
        return new StringIterator(this.s);
    }

    public static void main(String[] args) {
        IterableString string = new IterableString("Hello, this is a test. Bye!");
        for (String word : string) {
            System.out.println(word);
        }
    }
}
