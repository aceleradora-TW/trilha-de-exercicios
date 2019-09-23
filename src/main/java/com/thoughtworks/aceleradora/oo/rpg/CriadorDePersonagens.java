package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Personagem defesa = new Personagem();
        defesa.setNome("Lauri, o místico");
        defesa.setForca(50);
        defesa.setAgilidade(30);
        defesa.setCarisma(2);
        defesa.setConcentracao(10);

        Arma ferrugem = new Arma();
        ferrugem.setNome("Faca de cozinha enferrujada");
        ferrugem.setBonusDeAtaque(30);

        Armadura capiva = new Armadura();
        capiva.setNome("Armadura de Couro de Capivara");
        capiva.setBonusDeDefesa(50);

        defesa.setArma(ferrugem);
        defesa.setArmadura(capiva);

        return defesa;
    }

    public Personagem criarPersonagemDeAtaque() {
        Personagem ataque = new Personagem();
        ataque.setNome("Romilda, a destruidora");
        ataque.setForca(150);
        ataque.setAgilidade(10);
        ataque.setCarisma(200);
        ataque.setConcentracao(10);

        Arma facao = new Arma();
        facao.setNome("Facão três listras lendário");
        facao.setBonusDeAtaque(530);

        Armadura folha = new Armadura();
        folha.setNome("Armadura de folha de bananeira reforçada");
        folha.setBonusDeDefesa(100);

        ataque.setArma(facao);
        ataque.setArmadura(folha);
        return ataque;
    }

}
