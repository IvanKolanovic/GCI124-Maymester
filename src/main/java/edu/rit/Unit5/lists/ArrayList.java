package edu.rit.Unit5.lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayList<E> implements List<E> {

    private Object[] elements;
    private int size;

    public ArrayList() {
        this.elements = new Object[5];
        this.size = 0;
    }

    @Override
    public void append(E value) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }

        elements[size] = value;
        size++;
    }

    @Override
    public E get(int index) {
        return (E) this.elements[index];
    }

    @Override
    public void set(int index, E value) {
        this.elements[index] = value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "elements= " + Arrays.toString(elements) +
                ", size= " + size;
    }


    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(elements, size);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        List.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator();
    }


    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
//        intList.set(0, 4);
//        intList.set(1, 1);
        intList.append(0);
        intList.append(1);
        intList.append(2);
        System.out.println(intList);
        intList.set(0, 5);
        intList.set(2, 22);
        System.out.println(intList);

        for (int number : intList) {
            System.out.println("My number: " + number);
        }
    }

}
