public class Pessoa {
    String nome;
    int idade;
    String cpf;
    Carro carro;


    public void andar(){
        System.out.println("Pessoa está andando com o carro " + carro.modelo);
    }


}
