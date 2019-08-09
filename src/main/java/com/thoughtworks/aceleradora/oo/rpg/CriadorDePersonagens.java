package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Personagem lauri = new Personagem();
        Arma arma = new Arma();
        Armadura armadura = new Armadura();

        arma.setNome("Faca de cozinha enferrujada");
        arma.setBonusDeAtaque(30);

        armadura.setNome("Armadura de Couro de Capivara");
        armadura.setBonusDeDefesa(50);

        lauri.setNome("Lauri, o místico");
        lauri.setForca(50);
        lauri.setAgilidade(30);
        lauri.setCarisma(2);
        lauri.setConcentracao(10);
        lauri.setArma(arma);
        lauri.setArmadura(armadura);

        return lauri;
    }

    public Personagem criarPersonagemDeAtaque() {
       Personagem romilda = new Personagem();
       Arma arma = new Arma();
       Armadura armadura = new Armadura();

       arma.setNome("Facão três listras lendário");
       arma.setBonusDeAtaque(530);

       armadura.setNome("Armadura de folha de bananeira reforçada");
       armadura.setBonusDeDefesa(100);

       romilda.setNome("Romilda, a destruidora");
       romilda.setForca(150);
       romilda.setAgilidade(10);
       romilda.setCarisma(200);
       romilda.setConcentracao(10);
       romilda.setArmadura(armadura);
       romilda.setArma(arma);

        return romilda;
    }

}
