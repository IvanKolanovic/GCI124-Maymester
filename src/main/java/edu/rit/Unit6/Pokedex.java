package edu.rit.Unit6;

public class Pokedex {
    private NodeBST node;

    public Pokedex() {
        this.node = new NodeBST();
    }

    public void addPokemon(int number) {
        if (!containsPokemon(number))
            node.insert(number);
    }

    public boolean containsPokemon(int number) {
        if (node.getNode() != null)
            return node.getNode().search(number);
        else return false;
    }

    @Override
    public String toString() {
        return node.toString();
    }

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.addPokemon(4);
        pokedex.addPokemon(129);
        pokedex.addPokemon(36);
        pokedex.addPokemon(132);
        pokedex.addPokemon(1);
        pokedex.addPokemon(50);
        pokedex.addPokemon(3);
        pokedex.addPokemon(9);
        pokedex.addPokemon(51);
        pokedex.addPokemon(54);
        pokedex.addPokemon(130);
        pokedex.addPokemon(6);
        pokedex.addPokemon(25);
        pokedex.addPokemon(136);
        pokedex.addPokemon(2);

        System.out.println(pokedex);
        System.out.println(130 + ": " + pokedex.containsPokemon(130));
        System.out.println(2 + ": " + pokedex.containsPokemon(2));
        System.out.println(150 + ": " + pokedex.containsPokemon(150));
        System.out.println(75 + ": " + pokedex.containsPokemon(75));
    }

}


