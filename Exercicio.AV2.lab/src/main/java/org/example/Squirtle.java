package org.example;

public class Squirtle extends Pokemon implements FazerBarulho{
    private float multiplicadorAgua;

    public Squirtle(String nome, String tipo) {
        super(nome, tipo);
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println(multiplicadorAgua + " multiplicador de água");
    }

    @Override
    public void atacar() {

        System.out.println(getNome() + " está atacando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está fazendo barulho");

    }
}
