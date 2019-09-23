package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Arma arma = new Arma("Faca de cozinha enferrujada", 30);
        Armadura armadura = new Armadura("Armadura de Couro de Capivara", 50);

        Personagem personagem = new Personagem("Lauri, o místico", arma, armadura);

        personagem.setAgilidade(30);
        personagem.setCarisma(2);
        personagem.setConcentracao(10);
        personagem.setForca(50);
        return personagem;
    }

    public Personagem criarPersonagemDeAtaque() {
        Arma arma = new Arma("Facão três listras lendário", 530);
        Armadura armadura = new Armadura("Armadura de folha de bananeira reforçada", 100);

        Personagem personagem = new Personagem("Romilda, a destruidora", arma, armadura);

        personagem.setAgilidade(10);
        personagem.setCarisma(200);
        personagem.setConcentracao(10);
        personagem.setForca(150);
        return personagem;
    }

}
