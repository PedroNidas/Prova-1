package org.example;

public class Treinador {
    private String nome;
   // private Pokemon pokemons[];
    private Pokemon[] pokemons = new Pokemon[10];


    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public Treinador(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public Treinador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addPokemon(Pokemon p) {
        for (int i = 0; i < pokemons.length; i++)
        {
            if(pokemons[i] == null){
                pokemons[i] = p;
                break;
            }
            else
                System.out.println("Pokemon adicionado");
        }

    }
    public void mostraInfo(){
        System.out.println("Treinador: " + getNome());
        for (int i=0 ;i<100; i++){
            if(pokemons[i] != null){
                pokemons[i].mostraInfo();
            }
        }
    }
}
