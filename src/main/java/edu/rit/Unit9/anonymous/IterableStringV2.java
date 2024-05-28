package edu.rit.Unit9.anonymous;

import java.util.Iterator;

public class IterableStringV2 implements Iterable<String> {

    private String s;

    public IterableStringV2(String s) {
        this.s = s;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            private String[] words = s.split(" ");

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                if (index >= words.length) throw new IndexOutOfBoundsException("Index is out of bounds");

                int tempIndex = this.index;
                this.index++;
                return words[tempIndex];
            }
        };
    }


    public static void main(String[] args) {
        IterableStringV2 string = new IterableStringV2("Hello, this is a test. Bye!");
        for (String word : string) {
            System.out.println(word);
        }
    }
}
