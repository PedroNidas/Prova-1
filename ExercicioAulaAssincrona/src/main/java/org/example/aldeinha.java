import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Aldeia {
    private List<Ninja> ninjas = new ArrayList<>();
    private Map<Character, Integer> quantidadePorTitulo = new HashMap<>();

    public void adicionarNinja() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do ninja: ");
        String nome = scanner.nextLine();
        System.out.print("Título (Gennin, Chunnin ou ANBU): ");
        String titulo = scanner.nextLine();
        System.out.print("Ranking (S, A, B, C ou D): ");
        char ranking = scanner.next().charAt(0);

        Ninja ninja = new Ninja(nome, titulo, ranking);
        ninjas.add(ninja);

        // Atualizar a quantidade de ninjas por título
        quantidadePorTitulo.put(titulo.charAt(0), quantidadePorTitulo.getOrDefault(titulo.charAt(0), 0) + 1);

        System.out.println("Ninja adicionado com sucesso!");
    }

    public void mostrarInformacoesDaAldeia() {
        System.out.println("\nInformações da Aldeia e seus Ninjas:");
        for (Ninja ninja : ninjas) {
            System.out.println("Nome: " + ninja.getNome());
            System.out.println("Título: " + ninja.getTitulo());
            System.out.println("Ranking: " + ninja.getRanking());
            System.out.println("-----------------------------");
        }
    }

    public void mostrarNinjasRankingS() {
        System.out.println("\nNinjas com Ranking S:");
        for (Ninja ninja : ninjas) {
            if (ninja.getRanking() == 'S') {
                System.out.println(ninja.getNome());
            }
        }
    }

    public void mostrarQuantidadePorTitulo() {
        System.out.println("\nQuantidade de Ninjas por Título:");
        for (Map.Entry<Character, Integer> entry : quantidadePorTitulo.entrySet()) {
            System.out.println("Título: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }
}

