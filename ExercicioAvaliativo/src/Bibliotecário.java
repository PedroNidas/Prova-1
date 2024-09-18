public class Bibliotecário {
    private String nome;
    private int idade;
    private boolean disponivel;



    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void listarLivros (Biblioteca inatel)
    {
        for (int i = 0; i < inatel.getLivros().length; i++)
        {
            if (inatel.getLivros()[i] != null)
                System.out.println("Livro: " + inatel.getLivros()[i].getTitulo());
        }
    }


    @Override
    public String toString() {
        return "Bibliotecário{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
