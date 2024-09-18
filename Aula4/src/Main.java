import br.sagas2.Livro;

public class Main {
    public static void main(String[] args) {

        int[] x = new int[2];

        x[0] = 1;
        x[1] = 3;

        for (int item : x)
        {
            System.out.println(item);
        }


        Livro l1 = new Livro(3);
        Livro l2 = new Livro("Joao e o pe de feijao", 5);
        Livro l3 = new Livro();

        System.out.println(l2.toString());






    }
}