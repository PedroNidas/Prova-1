public class Personagem {
    String nome;
    int vida;
    int pontos;

    public void Correr()
    {
        System.out.println("O " + nome + " está correndo");
    }

    public void Apanhar()
    {
        System.out.println("O " + nome + " apanhou : ( ");
        vida = vida - 1;
        System.out.println("Nova vida: " + vida);
    }


}
