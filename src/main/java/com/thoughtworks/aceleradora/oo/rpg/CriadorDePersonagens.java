package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();
        Armadura armadura = new Armadura();

        arma.setNome("Faca de cozinha enferrujada");
        arma.setBonusDeAtaque(30);

        armadura.setNome("Armadura de Couro de Capivara");
        armadura.setBonusDeDefesa(50);

        personagem.setNome("Lauri, o místico");
        personagem.setForca(50);
        personagem.setAgilidade(30);
        personagem.setCarisma(2);
        personagem.setConcentracao(10);
        personagem.setArma(arma);
        personagem.setArmadura(armadura);

        return personagem;
    }

    public Personagem criarPersonagemDeAtaque() {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();
        Armadura armadura = new Armadura();

        arma.setNome("Facão três listras lendário");
        arma.setBonusDeAtaque(530);

        armadura.setNome("Armadura de folha de bananeira reforçada");
        armadura.setBonusDeDefesa(100);

        personagem.setNome("Romilda, a destruidora");
        personagem.setForca(150);
        personagem.setAgilidade(10);
        personagem.setCarisma(200);
        personagem.setConcentracao(10);
        personagem.setArmadura(armadura);
        personagem.setArma(arma)q
    qqqq;

        return personagem;
    }

}
