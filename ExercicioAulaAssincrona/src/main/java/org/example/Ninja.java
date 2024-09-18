package org.example;

public class Ninja {

    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(nome, idade, titulo, ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ranking: " + ranking);
    }
}
