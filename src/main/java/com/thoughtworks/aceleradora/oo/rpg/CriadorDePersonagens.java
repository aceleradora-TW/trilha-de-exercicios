package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Personagem personagemDefesa = new Personagem();
        personagemDefesa.setNome("Lauri, o místico");
        personagemDefesa.setForca(50);
        personagemDefesa.setAgilidade(30);
        personagemDefesa.setCarisma(2);
        personagemDefesa.setConcentracao(10);

        Arma arma = new Arma();
        arma.setNome("Faca de cozinha enferrujada");
        arma.setBonusDeAtaque(30);
        personagemDefesa.setArma(arma);

        Armadura armadura = new Armadura();
        armadura.setNome("Armadura de Couro de Capivara");
        armadura.setBonusDeDefesa(50);
        personagemDefesa.setArmadura(armadura);

        return personagemDefesa;
    }

    public Personagem criarPersonagemDeAtaque() {
        Personagem personagemAtaque = new Personagem();
        personagemAtaque.setNome("Romilda, a destruidora");
        personagemAtaque.setForca(150);
        personagemAtaque.setAgilidade(10);
        personagemAtaque.setCarisma(200);
        personagemAtaque.setConcentracao(10);

        Arma arma = new Arma();
        arma.setNome("Facão três listras lendário");
        arma.setBonusDeAtaque(530);
        personagemAtaque.setArma(arma);

        Armadura armadura = new Armadura();
        armadura.setNome("Armadura de folha de bananeira reforçada");
        armadura.setBonusDeDefesa(100);
        personagemAtaque.setArmadura(armadura);
        return personagemAtaque;
    }

}
