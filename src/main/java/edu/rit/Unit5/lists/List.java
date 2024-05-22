package edu.rit.Unit5.lists;

public interface List<E> extends Iterable<E> {

    void append(E value);

    E get(int index);

    void set(int index, E value);

    int size();
}
