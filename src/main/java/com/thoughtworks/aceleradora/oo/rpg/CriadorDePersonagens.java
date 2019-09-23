package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {

        Personagem defender = new Personagem();

        Arma weapon = new Arma();
        weapon.setNome("Faca de cozinha enferrujada");
        weapon.setBonusDeAtaque(30);

        Armadura armor = new Armadura();
        armor.setNome("Armadura de Couro de Capivara");
        armor.setBonusDeDefesa(50);

        defender.setNome("Lauri, o místico");
        defender.setForca(50);
        defender.setAgilidade(30);
        defender.setCarisma(2);
        defender.setConcentracao(10);
        defender.setArma(weapon);
        defender.setArmadura(armor);

        return defender;
    }

    public Personagem criarPersonagemDeAtaque() {

        Personagem avanger = new Personagem();

        Arma weapon = new Arma();
        weapon.setNome("Facão três listras lendário");
        weapon.setBonusDeAtaque(530);

        Armadura armor = new Armadura();
        armor.setNome("Armadura de folha de bananeira reforçada");
        armor.setBonusDeDefesa(100);

        avanger.setNome("Romilda, a destruidora");
        avanger.setForca(150);
        avanger.setAgilidade(10);
        avanger.setCarisma(200);
        avanger.setConcentracao(10);
        avanger.setArma(weapon);
        avanger.setArmadura(armor);

        return avanger;

    }

}
