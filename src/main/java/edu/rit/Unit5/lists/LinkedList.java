package edu.rit.Unit5.lists;

import edu.rit.Unit5.generics.GenericNode;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {

    private GenericNode<E> head;
    private GenericNode<E> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void append(E value) {
        GenericNode<E> node = new GenericNode<>(value);
        if (head == null) {
            this.head = node;
            this.tail = node;
        } else {
            tail.setNextNode(node);
            tail = node;
        }

        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        GenericNode<E> currentNode = head;
        while (index > 0) {
            currentNode = currentNode.getNextNode();
            index--;
        }
        return currentNode.getValue();
    }

    @Override
    public void set(int index, E value) {
        GenericNode<E> currentNode = head;
        while (index > 0) {
            currentNode = currentNode.getNextNode();
            index--;
        }
        currentNode.setValue(value);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new NodeIterator<>(head);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
//        intList.set(0, 4);
//        intList.set(1, 1);
        linkedList.append(0);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.set(0, 5);
        linkedList.set(2, 22);

        for (int number : linkedList) {
            System.out.println("My number: " + number);
        }
    }
}
