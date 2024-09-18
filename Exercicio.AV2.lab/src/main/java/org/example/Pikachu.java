package org.example;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{

    private float soltarRaios;

    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, float soltarRaios) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println(soltarRaios + " soltar raios");
        System.out.println(paralisiaEletrica + " paralisia eletrica");
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
        if(soltarRaios > 750){
            System.out.println(getNome() + " conseguiu ganhar de seu oponente!");
        }
        else {
            System.out.println(getNome() +  " perdeu a batalha!");
        }
    }
}
