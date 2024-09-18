package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();
        Time times = new Time();
        int op; //para escolher qual ação quer realizar
        boolean sair = true; //realizar a operação até sair for verdadeiro

        while(sair) {
            System.out.println("Bem vindo ao nosso sistema de controle dos Jogadore!!");
            System.out.println("Escolha ação deseja realizar: ");
            System.out.println("1 -  Adicionar um jogador ao time;");
            System.out.println("2 -  Mostrar as informações do time e seus jogadores;");
            System.out.println("3 -  Mostrar os nomes dos jogadores com nota maior ou igual a 90;");
            System.out.println("4 -  Mostrar a quantidade de goleiros, defensores, meio campistas e atacantes;");
            System.out.println("5 -  Sair do sistema.");
            op = sc.nextInt();
            sc.nextLine(); //para poder digitar uma String

            switch (op){
                case 1:
                    times.addJogador();
                    break;
                case 2:
                    times.mostraInfo();
                    break;
                case 3:
                    times.notaMaior90();
                    break;
                case 4:
                    times.mostraPosicoes();
                    break;
                case 5:
                    sair = false;
                    break;
            }
            System.out.println("Agradecemos sua contribuição!");
        }
        }
    }
}