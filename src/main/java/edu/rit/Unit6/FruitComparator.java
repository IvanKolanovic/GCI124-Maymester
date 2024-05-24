package edu.rit.Unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit a, Fruit b) {
        double priceDifference = a.getPrice() - b.getPrice();
        if (priceDifference != 0) return (int) priceDifference;
        return a.getName().compareTo(b.getName());
    }

    public static void main(String[] args) {
        List<Fruit> fruit = new ArrayList<>();
        fruit.add(new Fruit("Peach", 2.25));
        fruit.add(new Fruit("Apple", 2.0));
        fruit.add(new Fruit("Mango", 2));
        fruit.add(new Fruit("Plum", 2));
        fruit.add(new Fruit("Banana", 1.0));

        System.out.println(fruit);
        Collections.sort(fruit, new FruitComparator());
        System.out.println(fruit);
    }


}
