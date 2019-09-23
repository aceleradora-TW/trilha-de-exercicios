package com.thoughtworks.aceleradora.oo.rpg;

public class Armadura {

    private String nome;
    private int bonusDeDefesa;

    public Armadura(String nome, int bonusDeDefesa) {
        this.nome = nome;
        this.bonusDeDefesa = bonusDeDefesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonusDeDefesa() {
        return bonusDeDefesa;
    }

    public void setBonusDeDefesa(int bonusDeDefesa) {
        this.bonusDeDefesa = bonusDeDefesa;
    }
}
