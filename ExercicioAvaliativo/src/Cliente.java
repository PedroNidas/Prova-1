public class Cliente {
    private String nome;
    private int idade;
    private double debito;

    public Cliente(String nome, int idade, double debito) {
        this.nome = nome;
        this.idade = idade;
        this.debito = debito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getDebito() {
        return debito;
    }


    public double pagarDebito(double quantia)
    {
        if (debito > 0)
            debito = debito - quantia;

        return debito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", debito=" + debito +
                '}';
    }
}
