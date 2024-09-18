public class mainPersonagem {


    public static void main(String[] args) {


        Personagem pacman = new Personagem();

        pacman.nome = "Pacman";
        pacman.vida = 10;
        pacman.pontos = 20;


        pacman.Apanhar();
        pacman.Correr();
    }
}