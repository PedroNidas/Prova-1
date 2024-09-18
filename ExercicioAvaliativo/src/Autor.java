public class Autor {
    private String nome;
    private String pais;

    public Autor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }


    public void escreverLivro(Livro livro)
    {
        System.out.println("Silencio! Autor está escrevendo");
        livro.setNomeAutor(this.nome);
    }


}
