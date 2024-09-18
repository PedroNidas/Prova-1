package org.example;

public class Jogador {

    String nome;
    int idade;
    String posicao;
    int nota;

    public Jogador(String nome, int idade, String posicao, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.nota = nota;
    }

    void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posição: " + posicao);
        System.out.println("Nota: " + nota);
    }
}
