package edu.rit.Unit9.anonymous;

import java.util.Iterator;

public class StringIterator implements Iterator<String> {

    private int index;
    private String[] words;

    public StringIterator(String sentence) {
        this.index = 0;
        this.words = sentence.split(" ");
    }

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
}
