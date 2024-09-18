package org.example;

public abstract class  Pokemon{
    static int qtdPokemon;
    private String nome;
    private String tipo;
    Helditem helditem =  new Helditem();

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon ++;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void mostraInfo(){
        /*if (helditem != null)
        {
            System.out.println("Pokemon tem Helditem " + getNome() );
        }*/

        System.out.println("\n-------Informações do Pokemon");
        System.out.println("Pokemon " + getNome()); //nome pokemon
        System.out.println("Tipo: " + getTipo()); //tipo pokemon
    }

    public abstract void atacar();
}
