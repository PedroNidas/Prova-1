package org.example;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{
    private float luminosidadeAmbiente;


    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println(luminosidadeAmbiente + " luminosidade ambiente");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando");

    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está fazendo barulho");
    }

    @Override
    public void ataqueEspecial() {
        if(luminosidadeAmbiente > 650){
            System.out.println(getNome() + " ganhou do seu oponente!");
        }
    }
}
