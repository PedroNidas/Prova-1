package org.example;

public class Time {

    String nome;
    String pais;
    Jogador[] jogadores;
    Jogador jogador = new Jogador();
    int quantidade; //verificar a quantidade de jogadores que tem no time

    public Time(String nome, String pais, int numJogadores) {
        this.nome = nome;
        this.pais = pais;
        this.jogadores = new Jogador[numJogadores];
    }

    void mostraInfo(){
        System.out.println("Nome do time: " + nome);
        System.out.println("País: " + pais);
        for (Jogador jogador : jogadores) {
            if (jogador != null) { //para não ter saídas com valores nulos
                jogador.mostraInfo();
            }
        }
    }

    void addJogador(jogador: Jogador){
        if (quantidade < jogadores.length) {
            jogadores[quantidade] = jogador;
            quantidade++;
        } else {
            System.out.println("O time não possui mais espaço para a entrada de novos jogadores");
        }
    }

    void notaMaior90(){
        for (Jogador jogador : jogadores) {
            if (jogador != null && jogador.nota() >= 90) {
                jogador.mostraInfo();
            }
        }
    }

    void mostraPosicoes(){
        int goleiros = 0, defensores = 0, meioCampistas = 0, atacantes = 0;

        System.out.println("Goleiros: " + goleiros);
        System.out.println("Defensores: " + defensores);
        System.out.println("Meio Campistas: " + meioCampistas);
        System.out.println("Atacantes: " + atacantes);
    }

}
