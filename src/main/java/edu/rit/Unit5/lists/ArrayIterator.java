package edu.rit.Unit5.lists;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private Object[] elements;
    private int index;
    private int size;

    public ArrayIterator(Object[] elements, int stopIndex) {
        this.elements = elements;
        this.index = 0;
        this.size = stopIndex;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public E next() {
        E element = (E) elements[index];
        index++;
        return element;
    }
}
