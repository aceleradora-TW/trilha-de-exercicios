package com.thoughtworks.aceleradora.oo.rpg;

public class Arma {

    private String nome;

    private int bonusDeAtaque;

    public Arma(String nome, int bonusDeAtaque) {
        this.nome = nome;
        this.bonusDeAtaque = bonusDeAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonusDeAtaque() {
        return bonusDeAtaque;
    }

    public void setBonusDeAtaque(int bonusDeAtaque) {
        this.bonusDeAtaque = bonusDeAtaque;
    }
}
