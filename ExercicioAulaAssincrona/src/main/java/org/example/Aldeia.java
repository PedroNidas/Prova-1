package org.example;

import java.util.Map;
import java.util.Scanner;

public class Aldeia {

    String nome;
    int qtdMoradores;
    String regiao;
    Ninja ninja[] = new Ninja[10]; //diferente de null
    Scanner sc = new Scanner(System.in);

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    void adicionarNinja(ninja Ninja){
        System.out.println("Nome do ninja: ");
        String nome = sc.nextLine();
        System.out.println("Idade do ninja: ");
        int idade = sc.nextInt();
        System.out.println("Título (Gennin, Chunnin ou ANBU): ");
        String titulo = sc.nextLine();
        System.out.println("Ranking (S, A, B, C ou D): ");
        String ranking = sc.nextLine();

        //Ninja ninja = new Ninja(nome, idade, titulo, ranking);
        //ninja.adicionarNinja(ninja);

        System.out.println("Ninja adicionado com sucesso!");
    }

    void mostraInfo() {

        System.out.println("Nome Aldeia: " + nome);
        System.out.println("Quantidade de moradores: " + qtdMoradores);
        System.out.println("Região: " + regiao);

        for (int i = 0; i < ninja.length; i++) {
            if (ninja[i] != null) {
                System.out.println("Nome: " + ninja[i].nome);
                System.out.println("Idade: " + ninja[i].idade);
                System.out.println("Titulo: " + ninja[i].titulo);
                System.out.println("Ranking: " + ninja[i].ranking);
            }
        }
    }
    void rankingS(){
        System.out.println("Ninjas com Ranking 'S': ");
        for (Ninja ninja : ninja) {
            if (ninja != null){
                if (ninja.ranking() == 'S') {
                    System.out.println(ninja.nome);
                }
            }

        }
    }
    void qtdTitulos(){
        //
    }
}
