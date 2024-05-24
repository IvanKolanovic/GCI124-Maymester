package edu.rit.Unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PokemonComparator implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        String nameA = o1.getName();
        String nameB = o2.getName();
        return nameA.compareTo(nameB);
    }

    public static void main(String[] args) {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("A", 3));
        pokemons.add(new Pokemon("C", 1));
        pokemons.add(new Pokemon("B", 2));

        System.out.println(pokemons);
        Collections.sort(pokemons);
        System.out.println(pokemons);

        Collections.sort(pokemons, new PokemonComparator());
        System.out.println(pokemons);
    }
}
