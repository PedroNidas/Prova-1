package org.example;

public class Main {
    public static void main(String[] args) {

        Treinador treinador = new Treinador("João");
        Pokemon[] p = new Pokemon[3];

        Pokemon p1 = new Squirtle("Squirtle", "Serpente");
        Pokemon p2 = new Pikachu("Pikachu", "Helditem", 100);
        Pokemon p3 = new Bulbassaur("Bulbassaur", "Helditem", 100);

        p[0] = p1;
        p[1] = p2;
        p[2] = p3;

        treinador.addPokemon(p1);
        treinador.addPokemon(p2);
        treinador.addPokemon(p3);

        p1.atacar();
        p2.atacar();
        p3.atacar();



        treinador.mostraInfo();

        System.out.println(Pokemon.qtdPokemon);
    }
}