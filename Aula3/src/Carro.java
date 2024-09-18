public class Carro {
    String modelo;
    int velocidadeMaxima;
    String ano;

    Pneu[] pneus = new Pneu[4];
    Motor m1;

    //Criando uma composição
    public Carro()
    {
        m1 = new Motor();
    }

    public void acelerando()
    {
        System.out.println("Carro " + modelo + " está acelerando na velocidade máxima de " + velocidadeMaxima + " km/h");
    }

    public void caracteristicas()
    {
        System.out.println("Caracteristícas do carro: ");
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Max: " + velocidadeMaxima);
    }



}
