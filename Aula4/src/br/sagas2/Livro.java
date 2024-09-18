package br.sagas2;

public class Livro {
    String nome;

    int paginas;

    public Livro(String nome, int paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public Livro(int paginas){
        this.paginas = paginas;
    }

    public Livro() {}

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
