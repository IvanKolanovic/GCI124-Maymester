package edu.rit.Unit6.heaps;

import java.util.Arrays;

public class HeapArray implements Heap {
    private int[] array;
    private int size;

    public HeapArray() {
        this.array = new int[5];
        this.size = 0;
    }


    @Override
    public String toString() {
        return Arrays.toString(array) + ", " + size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public void add(int value) {
        if (size == array.length)
            array = Arrays.copyOf(array, size * 2);

        array[size] = value;

        // sifting up
        int childIndex = size;
        int parentIndex = (childIndex - 1) / 2;

        while (array[parentIndex] > array[childIndex]) {
            swap(parentIndex, childIndex);
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }

        size++;
    }

    private void swap(int parentIndex, int childIndex) {
        if (array[parentIndex] != array[childIndex]) {
            int temp = array[parentIndex];
            array[parentIndex] = array[childIndex];
            array[childIndex] = temp;
        }
    }

    @Override
    public int remove() {
        int temp = array[0];
        size--;
        swap(0, size);
        array[size] = 0;

        int parent = 0;
        while (parent < size) {
            int left = (parent * 2) + 1;
            int right = left + 1;
            int destination = parent;

            if (left < size)
                destination = left;

            if (right < size && array[right] < array[left])
                destination = right;

            if (array[destination] < array[parent]) {
                swap(destination, parent);
                parent = destination;
            } else break;
        }

        return temp;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {
        Heap heap = new HeapArray();
        System.out.println(heap);
        heap.add(5);
        System.out.println(heap);
        heap.add(4);
        System.out.println(heap);
        heap.add(3);
        System.out.println(heap);
        heap.add(2);
        System.out.println(heap);
        heap.add(1);
        System.out.println(heap);

        System.out.println(heap.remove() + ", " + heap);
        System.out.println(heap.remove() + ", " + heap);
    }
}
