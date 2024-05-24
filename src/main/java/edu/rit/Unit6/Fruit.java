package edu.rit.Unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + "$" + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Fruit otherFruit) {
        int result = this.name.compareTo(otherFruit.name);
        if (result == 0) return (int) (this.price - otherFruit.price);

        return result;
    }

    public static void main(String[] args) {
        List<Fruit> fruit = new ArrayList<>();
        fruit.add(new Fruit("Peach", 2.25));
        fruit.add(new Fruit("Apple", 2.0));
        fruit.add(new Fruit("Apple", 3.75));
        fruit.add(new Fruit("Plum", 1.50));
        fruit.add(new Fruit("Banana", 1.0));

        System.out.println(fruit);
        Collections.sort(fruit);
        System.out.println(fruit);
    }
}
