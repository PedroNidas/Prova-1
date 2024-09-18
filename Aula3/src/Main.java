public class Main {
    public static void main(String[] args) {



        //Instanciando a classe carro
        Carro c1 = new Carro();

        //Atribuindo valores aos membros(variáveis)
        c1.modelo = "Golzinho";
        c1.ano = "98";
        c1.velocidadeMaxima = 200;


        //Instanciando a classe pessoa
        Pessoa p1 = new Pessoa();

        //Criando uma agregação
        p1.carro = c1;

        System.out.println(p1.carro.ano);

        //Utilizando composição
        c1.m1.cilindradas = 200;
        System.out.println(c1.m1.cilindradas);


        Pneu pneuzinho = new Pneu();
        pneuzinho.tipo = "Careca";
        pneuzinho.novo = false;

        c1.pneus[0] = pneuzinho;



    }
}