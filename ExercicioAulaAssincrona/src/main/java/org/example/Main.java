package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aldeia aldeia = new Aldeia("Jurá", 123, "Sul");
        int opcao;
        boolean sair = true;

        while(sair) {

            System.out.println("Selecione o que deseja fazer no sistema:");
            System.out.println("1 - Adicionar Ninja na aldeia;");
            System.out.println("2 - Mostrar as informações da aldeia e seus ninjas;");
            System.out.println("3 - Mostrar nomes dos ninjas classificados na ranking S;");
            System.out.println("4 - Mostrar a quantidade de ninjas Gennin, Chunnin e ANBU;");
            System.out.println("5 - Sair do sistema.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    aldeia.adicionarNinja(Ninja);
                    break;
                case 2:
                    aldeia.mostraInfo();
                    break;
                case 3:
                    aldeia.rankingS();
                    break;
                case 4:
                    aldeia.qtdTitulos();
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");


            }
        }

    }
}