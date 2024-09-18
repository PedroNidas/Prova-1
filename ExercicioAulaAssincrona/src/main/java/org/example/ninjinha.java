public class Ninja {
    private String nome;
    private String titulo;
    private char ranking;

    public Ninja(String nome, String titulo, char ranking) {
        this.nome = nome;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public char getRanking() {
        return ranking;
    }
}
