import java.util.Arrays;

public class Biblioteca {
    private String nome;
    private String bairro;
    private Livro[] livros = new Livro[4];
    private Bibliotecário bibliotecario;

    public Bibliotecário getBibliotecario() {
        return bibliotecario;
    }

    public Livro[] getLivros() {
        return livros;
    }


    public Biblioteca(String bairro, String nome) {
        this.bairro = bairro;
        this.nome = nome;
        bibliotecario = new Bibliotecário();
    }

    public void emprestarLivro (Bibliotecário b1, Cliente c1, Livro l1) {
        if (c1.getDebito() <= 0 && b1.isDisponivel() == true && confereLivro(l1) == true)
        {
            System.out.println("Livro " + l1.getTitulo() + " foi emprestado!");
            removerLivro(l1);
        }
        else
            System.out.println("Não foi possível emprestar o livro");
    }

    private boolean confereLivro(Livro l1)
    {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == l1)
                return true;

        }
        return false;
    }

    public void removerLivro (Livro l1)
    {
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i] == l1)
            {
                livros[i] = null;
                System.out.println("Livro " + l1.getTitulo() + " foi removido");
                break;
            }
        }
    }

    public void addLivro (Livro l1)
    {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = l1;
                System.out.println("Livro adicionado!");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", bairro='" + bairro + '\'' +
                ", bibliotecario=" + bibliotecario +
                '}';
    }
}
