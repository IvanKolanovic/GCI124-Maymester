package edu.rit.Unit5.lists;

import edu.rit.Unit5.generics.GenericNode;

import java.util.Iterator;

public class NodeIterator<E> implements Iterator<E> {

    private GenericNode<E> node;

    public NodeIterator(GenericNode<E> node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public E next() {
        E value = node.getValue();
        node = node.getNextNode();
        return value;
    }
}
