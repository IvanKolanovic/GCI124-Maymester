package edu.rit.Unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokemon implements Comparable<Pokemon> {
    private final String name;
    private final int number;

    public Pokemon(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Pokemon pokemon) {
        return this.number - pokemon.getNumber();
    }

    @Override
    public String toString() {
        return number + ": " + name;
    }

    public static void main(String[] args) {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("A",3));
        pokemons.add(new Pokemon("B",2));
        pokemons.add(new Pokemon("C",1));

        System.out.println(pokemons);
        Collections.sort(pokemons);
        System.out.println(pokemons);

    }
}
