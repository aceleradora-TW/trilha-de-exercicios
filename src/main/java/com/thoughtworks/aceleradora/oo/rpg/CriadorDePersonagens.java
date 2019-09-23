package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {

        Armadura armadura =  new Armadura();
        Arma arma = new Arma();

        arma.setNome("Faca de cozinha enferrujada");
        arma.setBonusDeAtaque(30);

        armadura.setNome("Armadura de Couro de Capivara");
        armadura.setBonusDeDefesa(50);

        Personagem personagem =  new Personagem();
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
        // Personagem de Ataque

//    Implemente o método `criarPersonagemDeAtaque` de modo que este retorne um personagem que cumpra com os seguintes
//    requisitos:
//
//            * Seu nome é "Romilda, a destruidora"
//
//            * Possui "150" pontos de forca
//    * Possui "10" pontos de agilidade
//    * Possui "200" pontos de carisma
//    * Possui "10" pontos de concentracao
//
//    * Sua arma se chama "Facão três listras lendário" e entrega um bônus de "530" pontos de ataque
//
//    * Sua armadura se chama "Armadura de folha de bananeira reforçada" e entrega um bônus de "100" pontos de defesa

        Arma arma = new Arma();
        Armadura armadura = new Armadura();
        Personagem personagem  = new Personagem();

        arma.setBonusDeAtaque(530);
        arma.setNome("Facão três listras lendário");
        armadura.setBonusDeDefesa(100);
        armadura.setNome("Armadura de folha de bananeira reforçada");
        personagem.setArmadura(armadura);
        personagem.setArma(arma);
        personagem.setConcentracao(10);
        personagem.setCarisma(200);
        personagem.setAgilidade(10);
        personagem.setNome("Romilda, a destruidora");
        personagem.setForca(150);

        return personagem;
    }
}
