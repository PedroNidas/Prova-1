import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aldeia aldeia = new Aldeia();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar um ninja na aldeia");
            System.out.println("2. Mostrar as informações da aldeia e seus ninjas");
            System.out.println("3. Mostrar os nomes dos ninjas classificados no ranking S");
            System.out.println("4. Mostrar quantidade de ninjas Gennin, Chunnin e ANBU");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    aldeia.adicionarNinja();
                    break;
                case 2:
                    aldeia.mostrarInformacoesDaAldeia();
                    break;
                case 3:
                    aldeia.mostrarNinjasRankingS();
                    break;
                case 4:
                    aldeia.mostrarQuantidadePorTitulo();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
